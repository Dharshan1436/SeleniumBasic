package FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
   public WebDriver driver;
    @Test
    public  void Frames_Function() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/dhars/OneDrive/Desktop/Selenium/iFrame2.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.id("t1")).sendKeys("DHARSHAN");
        Thread.sleep(2000);
        //        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("t2")).sendKeys("PL");

        Thread.sleep(5000);
        driver.close();
    }
}
