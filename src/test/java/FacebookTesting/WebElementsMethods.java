package FacebookTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebElementsMethods {
    WebDriver driver;
    @Test
    public void webElementMethod() throws InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("email"));
        userName.clear();
        userName.sendKeys("dharshan1436@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("Navana@1436");


        String attribute = userName.getDomAttribute("class");
        System.out.println("Attribut class: "+attribute);

        String cssValue = userName.getCssValue("color");
        System.out.println("CSS value: "+cssValue);

        Point location = userName.getLocation();
        System.out.println("Coordinate x is: "+location.getX());
        System.out.println("Coordinate y is: "+location.getY());

        Rectangle rect = userName.getRect();
        System.out.println("Rectangle of userName");
        System.out.println("X: " + rect.getX());
        System.out.println("Y: " + rect.getY());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());

        Dimension size = userName.getSize();
        System.out.println("width of userName is: "+size.getWidth());
        System.out.println("height of userName is: "+size.getHeight());

        String tagName = userName.getTagName();
        System.out.println("Tagname of userName: "+tagName);

        String gettext = userName.getText();
        System.out.println("The text inside the heading is: "+gettext);

        boolean userNameIsVisible = userName.isDisplayed();
        System.out.println("UserName is visible or not: "+userNameIsVisible);

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        boolean logInButton = submitButton.isEnabled();
        System.out.println("Is the Log in button enabled? : " + logInButton);
        submitButton.submit();

//        boolean isChecked = userName.isSelected();
//        System.out.println("Is the checkbox selected? " + isChecked);

        Thread.sleep(1000);
        driver.close();
    }
}


