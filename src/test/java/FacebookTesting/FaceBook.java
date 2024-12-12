package FacebookTesting;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FaceBook {
    public WebDriver driver;
@DataProvider
    public  Object[][] datas(){
        Object[][] data = new Object[2][2];
        data[0][0]="dharshan1436@gmail.com";
        data[0][1]="Navana@1436";
        data[1][0]="7489629277";
        data[1][1]="bebyji@20";
        return data;

    }

    @Test(dataProvider = "datas")
    public  void facebookLogin( String emailId,String password   ) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys(emailId);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        Thread.sleep(9000);
        driver.close();
    }

    @Test
    public  void FaceBookRegister() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("DHARSHAN");
        driver.findElement(By.name("lastname")).sendKeys("PL");
        driver.findElement(By.id("day")).sendKeys("31");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.id("year")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("dharshan1436@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Dharshan123");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(9000);
driver.quit();
//driver.close();
    }



    @Test
    public  void facebookLoginForgetPassword() throws InterruptedException {
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
    public  void faceBookLoingAndSendMessage() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dharshan1436@gamil.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Navana@1436");
        driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@aria-label='Messenger'][@tabindex='0']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search Messenger']")).sendKeys("ram mehra mehra");
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//span[text()=\"Ram Mehra Mehra\"])[2]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@aria-label=\"Send a Like\"]")).click();
//        driver.findElement(By.xpath("//a[@aria-label=\"Video\"]")).click();
        Thread.sleep(10000);




        driver.close();
    }

    @Test
    public  void faceBookLoingAndRemovingFromList() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dharshan1436@gamil.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Navana@1436");
        driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(10000);

      driver.findElement(By.id(":Rjadakl6illkqismhpapd5aq:")).click();
        Thread.sleep(10000);
      driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'][text()='Remove'])[1]")).click();


        Thread.sleep(1000);
        driver.close();
    }
    @Test
    public  void faceBookLoingAndLogout() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dharshan1436@gamil.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Navana@1436");
        driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"])[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//div[@class=\"xu06os2 x1ok221b\"])[6]")).click();
        Thread.sleep(10000);
        driver.close();
    }
    @Test
    public  void faceBookLoingAndUpdateBio() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dharshan1436@gamil.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Navana@1436");
        driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//span[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()=\"Edit bio\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea")).clear();
        driver.findElement(By.xpath("//textarea")).sendKeys("DPL  FOREVER ?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();



    }




    @Test
    public  void FaceBookRegisterUsingXpathAxes () throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DHARSHAN");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("PL");
//child
//        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[5]")).click();
//parent
//        driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[5]//..")).click();
// descendant
//        driver.findElement(By.xpath("descendant::option[5]")).click()
        //ancestor
//        driver.findElement(By.xpath("(//option[5]/ancestor::select)[1]")).click();
//      preceding-sibling
       // driver.findElement(By.xpath("descendant::option[5]/preceding-sibling::option[1]")).click();
        //following-sibling
        driver.findElement(By.xpath("descendant::option[5]/following-sibling::option[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("Feb");
        driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dharshan@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dharshan123");


        driver.findElement(By.xpath("//button[@type='submit'][@name='websubmit']")).click();
        Thread.sleep(9000);
        driver.quit();
//driver.close();
    }



}