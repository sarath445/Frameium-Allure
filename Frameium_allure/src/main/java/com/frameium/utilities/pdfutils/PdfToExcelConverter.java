package com.frameium.utilities.pdfutils;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class PdfToExcelConverter {
	private static final String cdir = "C:/Users/JoneAbutelin/Downloads/excel1";
	private static final String currentTimeStamp = "20231116104200";
	/**
	 * Converts PDF form data to an Excel file.
	 *
	 * @param pdfFileName The path to the input PDF file.
	 * @throws Exception If an error occurs during the conversion process.
	 */
	public static void PdfFormdataToExcel(String pdfFileName) throws Exception {
		String path = cdir + "/SkriptmatePDFCompareOutput" + File.separator + currentTimeStamp;
		String destExcel = path + File.separator + "PDFFormExcelData.xls";
		@SuppressWarnings("resource")
		HSSFWorkbook myWorkBook = new HSSFWorkbook();
		HSSFSheet mySheet = myWorkBook.createSheet("PDFFormData");
		HSSFRow myRow = null;
		@SuppressWarnings("unused")
		HSSFCell myCell = null;
		PDDocument document = null;
		FileOutputStream out = null;
		int rowCount = 0;
		try {
			FileUtils.forceMkdir(new File(path));
			document = PDDocument.load(new File(pdfFileName));
			PDDocumentCatalog pdCatalog = document.getDocumentCatalog();
			PDAcroForm pdAcroForm = pdCatalog.getAcroForm();
			List<PDField> fields = pdAcroForm.getFields(); // get all fields in the form
			myRow = mySheet.createRow(0);
			myRow.createCell(0).setCellValue("FieldName");
			myRow.createCell(1).setCellValue("FieldValue");
			// Process each form field and populate the Excel sheet
			for (PDField field : fields) {
				HSSFRow newRow = mySheet.createRow(++rowCount);
				processField(field, field.getPartialName(), newRow);
			}
			// Write the workbook to the Excel file
			out = new FileOutputStream(new File(destExcel));
			myWorkBook.write(out);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (document != null) {
				document.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
	/*
	 * Recursively processes a PDF form field and populates the Excel row.
	 *
	 * @param field   The PDF form field.
	 * @param sParent The parent field name (for hierarchical fields).
	 * @param row     The Excel row to populate.
	 * 
	 */
	private static void processField(PDField field, String sParent, HSSFRow row) throws IOException {
		String partialName = field.getPartialName();
		@SuppressWarnings("unused")
		String fieldValue = null;
		if (field instanceof PDNonTerminalField) {
			if (!sParent.equals(field.getPartialName())) {
				if (partialName != null) {
					sParent = sParent + "." + partialName;
				}
			}
			for (PDField child : ((PDNonTerminalField) field).getChildren()) {
				processField(child, sParent, row);
			}
		} else {
			fieldValue = field.getValueAsString();
			row.createCell(0).setCellValue(field.getFullyQualifiedName());
			row.createCell(1).setCellValue(field.getValueAsString());
		}
	}
}
