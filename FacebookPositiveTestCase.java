package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPositiveTestCase {
    public static void main(String args[]) throws InterruptedException {
        //Open browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigating to URL
        driver.get("https://www.facebook.com/login/");

        //Verify Login Page
        driver.findElement(By.xpath("//div[text()=\"Log in to Facebook\"]")).isDisplayed();

        //Enter Email
        WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        email.sendKeys("noorg813@gmail.com");

        //Password
        WebElement password = driver.findElement(By.cssSelector("input#pass"));
        password.sendKeys("382");

        WebElement button = driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
        button.click();


        Thread.sleep(20000);
        driver.findElement(By.xpath("//div[text()=\"The email address or mobile number you entered isn't connected to an account. \"]")).isDisplayed();


        /*
        //Enter Password
        WebElement password = driver.findElement(By.cssSelector("input#pass"));
        password.sendKeys("382");

        //Waiting for 5 seconds
        Thread.sleep(5000);

        //Clicking Button
        WebElement button = driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
        button.click();


        Thread.sleep(30000);

        //Closinng Browser
        driver.close();

         */
    }
}
