package FacebookTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigators {
    public WebDriver driver;
    @Test
    public  void Navigator() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(9000);
        driver.navigate().to("http://www.facebook.com/");
        Thread.sleep(9000);
        driver.navigate().back();
        Thread.sleep(9000);
        driver.navigate().forward();
        Thread.sleep(9000);
        driver.navigate().refresh();
        driver.close();

    }
}
