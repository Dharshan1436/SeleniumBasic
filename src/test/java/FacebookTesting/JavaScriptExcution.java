package FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExcution {
    public WebDriver driver;
    @Test
    public void EnterTextIntoDisabledBox() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("file:///C:/Users/dhars/OneDrive/Desktop/Selenium/index.html");
        driver.manage().window().maximize();
        Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('t1').value='admin'");

        Thread.sleep(5000);
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(5000);
        js.executeScript("document.getElementById('t2').value='manager'");
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void ScrollUpAndDown() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email= driver.findElement(By.cssSelector("[type='text']"));
        email.sendKeys("dharshan1436@gmail.com");
        WebElement pass =driver.findElement(By.cssSelector("[type=\"password\"]"));
        pass.sendKeys("Navana@1436");
        WebElement login = driver.findElement(By.cssSelector("[type='submit']"));
        login.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
//scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }

    }
}
