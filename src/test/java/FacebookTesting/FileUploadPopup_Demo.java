package FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class FileUploadPopup_Demo {

    public WebDriver driver;

    @Test
    public void FileUploadPopup() throws InterruptedException {
        driver =new ChromeDriver();
        driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("C:\\Users\\dhars\\OneDrive\\Desktop\\Selenium\\"+"files.txt");
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("C:\\Users\\dhars\\OneDrive\\Desktop\\Selenium\\"+"files.txt");
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void FileUploadPopupUsingAutoIt() throws InterruptedException, IOException {



        driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter/");
        driver.manage().window().maximize();
        Thread.sleep(1000); // Allow page to load

        // Click on the upload button to open the file upload dialog
        driver.findElement(By.xpath("//button[contains(@class,'l3tlg0-0')]")).click();


        Thread.sleep(2000);


        Runtime.getRuntime().exec("C:\\Users\\dhars\\OneDrive\\Desktop\\Dpl.exe");


        Thread.sleep(20000);
//        FileDownload();
//        driver.quit();
    }

@Test
    public void FileDownload() throws InterruptedException {
    String downloadFilePath = "D:\\Downloads";
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("download.default_directory", downloadFilePath);
    prefs.put("profile.default_content_settings.popups", 0);

    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);

    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();

    driver.get("https://smallpdf.com/pdf-converter#r=result&t=806770daeb711b222ced4d4b6a3563a3&i=convert");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
    Thread.sleep(10000);
    driver.close();
}
}

