package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PdfInvoicePage {

    WebDriver driver;

    public PdfInvoicePage(WebDriver driver) {
        this.driver = driver;
    }

    private By pdfInvoiceBtn = By.linkText("PDF Invoice");
    public void downloadPdfInvoice() throws Exception {
        driver.findElement(pdfInvoiceBtn).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec(
            "C:\\Users\\91996\\OneDrive\\Documents\\PdfInvoice.exe"
        );
    }
}
