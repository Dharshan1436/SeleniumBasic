package FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_element_Locators {
    WebDriver driver;
    @Test
    public  void facebookLoginUsingNameAndId() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("dharshan1436@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Navana@1436");
        driver.findElement(By.name("login")).click();
        Thread.sleep(9000);
        driver.close();
    }
    @Test
    public  void FaceBookRegisterUsingXpath() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();//UsingXpath -> GroupBy
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DHARSHAN");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("PL");

        driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("31");
        driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Feb");
        driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dharshan1436@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dharshan123");


        driver.findElement(By.xpath("//button[@type='submit'][@name='websubmit']")).click();
        Thread.sleep(9000);
        driver.quit();
//driver.close();
    }
    @Test
    public  void facebookLoginUsingCssSelector() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email= driver.findElement(By.cssSelector("[type='text']"));
        email.sendKeys("dharshan1436@gmail.com");
        WebElement pass =driver.findElement(By.cssSelector("[type=\"password\"]"));
        pass.sendKeys("Navana@1436");
        WebElement login = driver.findElement(By.cssSelector("[type='submit']"));
        login.click();
        Thread.sleep(50000);
        driver.close();
    }
    @Test
    public  void InstLogin() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("9844480769");
        driver.findElement(By.name("password")).sendKeys("*******");
        driver.findElement(By.cssSelector("button[type='button' ")).click();
        driver.findElement(By.cssSelector("button[type='submit' ")).click();
        Thread.sleep(9000);
        driver.findElement(By.cssSelector("button[type='button' ")).click();

        Thread.sleep(9000);
        driver.close();
    }
    @Test
    public  void facebookLoginusingPartialLinkText() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Forgotte")).click();
        driver.findElement(By.id("identify_email")).sendKeys("dharshan1436@gmail.com");
        driver.findElement(By.id("did_submit")).click();
        Thread.sleep(9000);
        driver.close();
    }
    @Test
    public  void facebookLoginusinglLinkText() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.id("identify_email")).sendKeys("dharshan1436@gmail.com");
        driver.findElement(By.id("did_submit")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
