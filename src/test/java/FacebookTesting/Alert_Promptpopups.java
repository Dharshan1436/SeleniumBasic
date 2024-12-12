package FacebookTesting;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Promptpopups {

    public WebDriver driver;

    @Test
    public void AlertButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }
    @Test
    public  void  timerAlertButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)");
        Thread.sleep(2000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void confirmButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
       driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
//    alert.dismiss();
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }
    @Test
    public  void Alert_Promptpopup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Dharshan");
        Thread.sleep(2000);
//      alert.dismiss();
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }
@Test
    public void Hidden_Division_Popup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).click();
        Thread.sleep(2000);
    driver.findElement(By.linkText("25")).click();
    Thread.sleep(5000);

        driver.close();
}
}
