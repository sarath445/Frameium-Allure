package com.frameium.utilities.pdfutils;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ExtractImage {
	/*
     * Extract images from a PDF document and save them as PNG files.
     *
     * @param filePath The path to the PDF file.
     */
	public void extractImagesFromPDF(String filePath) {
		try(PDDocument document = PDDocument.load(new File(filePath))){
			int pageNumber =1;
			for(PDPage page:document.getPages()) {
				// Iterate through resources on the page and get the object
				for(COSName cosName:page.getResources().getXObjectNames()) {
					PDXObject xobject = page.getResources().getXObject(cosName);
					if (xobject instanceof PDImageXObject) {
                        // Create a file for the extracted image and save it in desired location 
						File file = new File("C:/Users/JoneAbutelin/Downloads/image" + pageNumber + ".png");
						BufferedImage image = ((PDImageXObject) xobject).getImage();  // Get the image and write it to the file
						ImageIO.write(image, "png", file);
					}				}
				pageNumber++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
