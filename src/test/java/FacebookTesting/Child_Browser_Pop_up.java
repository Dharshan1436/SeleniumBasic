package FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class Child_Browser_Pop_up {
    public WebDriver driver;

    @Test
    public void Child_Browser_Pop_up() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        WebElement jobs=driver.findElement(By.xpath("//span[text()='Jobs']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(jobs).perform();
        Thread.sleep(1000);
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.get("https://www.naukri.com/");
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : " + count);

        for (String windowHandles : allWindowHandles) {
            driver.switchTo().window(windowHandles);
            String title = driver.getTitle();
            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
            driver.close();
        }
    }
}

