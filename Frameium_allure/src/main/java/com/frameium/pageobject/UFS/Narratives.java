package com.frameium.pageobject.UFS;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;
import java.util.List;

public class Narratives extends GenericFunctions {
    private final Logger log = LoggerHelper.getLogger(Narratives.class);
    By nextpage=By.xpath("//a[@title='Next Page']");
    public void debitNarrativesDirectDebit(String description,String amount,String transactiondate) {
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                WebElement next=findElement(nextpage);
                next.click();
                i=1;
            }
            String a=findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4])")).getText();
            if (a.contains(description))
            {
                String Date=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]")).getText();
                String actualAmount=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]")).getText();
                String newBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String b=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                log.info("checking debit" );
                String bal1=newBalance;
                String s=bal1.replace(",", "");
                Double balance2=Double.parseDouble(s);
                String amo=amount;
                Double amount1=Double.parseDouble(amo);
                Double newbalance=balance2+amount1;
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                String balances=decimalFormat.format(newbalance);
                System.out.println(balances);
                String balance11=balances;
                int j=i-1;
                List<WebElement> wb=findElements((By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+j+"]/td[8]")));
                for(WebElement we:wb){
                    if(we.isDisplayed()&&we.isEnabled())
                        balance11=we.getText();
                }
                if(i==1) {
                    List<WebElement>wb1=findElements(By.xpath("(//*[@title='Previous Page'])[1]"));
                    for(WebElement we1:wb1){
                        if(we1.isDisplayed()&&we1.isEnabled())
                            we1.click();
                        By balance1=By.xpath("//table[@id='enquiryResponseData']//tbody/tr[last()]/td[8]");
                        WebElement balancee=findElement(balance1);
                        balance11=balancee.getText();
                    }
                }
                String bal=balance11;
                String s1=bal.replace(",", "");
                Double balance1=Double.parseDouble(s1);
                String amo1=amount;
                Double amount2=Double.parseDouble(amo1);
                Double newbalance2=balance1-amount2;
                DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
                String balances1=decimalFormat1.format(newbalance2);
                System.out.println(balances1);
                Assert.assertTrue(actualAmount.contains(amount)&& b.contains("Debit")&&balances1.contains(s));
                {
                    System.out.print(transactiondate+"  ");
                    System.out.print(actualAmount+" ");
                    System.out.print(b);
                    System.out.println("test pass");
                    log.info("Debit narrative verified...");
                    break;
                }}
        }
    }
}
