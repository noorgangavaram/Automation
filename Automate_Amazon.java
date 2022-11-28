package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Amazon {
    public static void main(String[] ars) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigating to amazon
        driver.get("https://www.amazon.in/");

        //Verify the page
        driver.findElement(By.id("nav-logo-sprites")).isDisplayed();

        //Select the serch Box in the page
        WebElement serch = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        serch.click();
        serch.sendKeys("Laptop");

        Thread.sleep(5000);
        //Select the one option from the list
        WebElement option = driver.findElement(By.xpath("//div[@class=\"autocomplete-results-container\"]/child::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/child::div/child::div"));
    }
}
