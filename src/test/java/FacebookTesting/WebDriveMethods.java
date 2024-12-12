package FacebookTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriveMethods {
    WebDriver driver;
    @Test
    public  void TestingWebDriveMethods() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().minimize();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);
        String ps = driver.getPageSource();
        System.out.println(title);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(url);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(ps);
        System.out.println("-------------------------------------------------------------------------------------");

        driver.close();
//        driver.quit();
    }
}
