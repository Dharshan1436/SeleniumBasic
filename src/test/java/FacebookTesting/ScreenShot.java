package FacebookTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
public WebDriver driver;
    @Test
    public void ScreenShot() throws InterruptedException, IOException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email= driver.findElement(By.cssSelector("[type='text']"));
        email.sendKeys("dharshan1436@gmail.com");
        WebElement pass =driver.findElement(By.cssSelector("[type=\"password\"]"));
        pass.sendKeys("Navana@1436");
        WebElement login = driver.findElement(By.cssSelector("[type='submit']"));
        login.click();
        Thread.sleep(5000);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File Sfile= ts.getScreenshotAs(OutputType.FILE);
        File Dfile= new File("C:\\Users\\dhars\\IdeaProjects\\SeleniumAutomation\\src\\test\\java\\FacebookTesting"+"facebook1.png");
        FileHandler.copy(Sfile,Dfile);

        driver.close();
    }
}
