package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class Autamating_Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigating to amazon
        driver.get("https://www.amazon.in/");

        //Verify the page
        driver.findElement(By.id("nav-logo-sprites")).isDisplayed();


        //Select the serch Box in the page
        WebElement serch = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        //Send the data to serch-bar
        serch.sendKeys("Laptop");

        //Click on the Serch button
        WebElement btn = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
        btn.click();

        //Verify the result page
        driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[3]")).isDisplayed();


        //Check the LENOVO
        WebElement check = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[4]"));
        check.click();

        //Check the ASUS
        WebElement check1 = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[6]"));
        check1.click();

        Thread.sleep(7000);

        //Verify the result page
        driver.findElement(By.xpath("(//img[@class=\"s-image\"])[2]")).isDisplayed();

        //click on the one product
        WebElement product = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
        product.click();

        //Verify the product page
        driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).isDisplayed();

        //click onn ADD TO CART
        //WebElement addToCart = driver.findElement(By.xpath("//span[@id=\"submit.add-to-cart-announce\"]"));
        //addToCart.click();


        //Close the browser
        driver.close();


    }
}
