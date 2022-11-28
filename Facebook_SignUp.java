package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.webauthn.WebAuthn;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SignUp {
    public static void main(String[] args){

        //Open Chrome Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/campaign/landing.php");

        //First Name
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("Noor Mohammad");

        //Last Name
        WebElement Surname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        Surname.sendKeys("Gangavaram");

        //Mobile
        WebElement mobile = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        mobile.sendKeys("323899238");

        //Password
        WebElement password = driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
        password.sendKeys("382");

        //Select day
        WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));

        //Create object of the SELECT CLASS
        Select selectday = new Select(day);
        selectday.selectByIndex(9);

        //Select Month
        WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        //Create object of the SELECT CLASS
        Select selectmonth = new Select(month);
        selectmonth.selectByValue("5");

        //Select Year
        WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        //Create object of the SELECT CLASS
        Select selectyear = new Select(Year);
        selectyear.selectByVisibleText("2002");

        //Selecting Male
        WebElement male = driver.findElement(By.xpath("//label[contains(text(),\"Male\")]"));
       boolean selectedMale =  male.isSelected();
       if(selectedMale == false){
           male.click();
       }

       //CLick the SignUp buttonn
        WebElement btn = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
        btn.click();
    }

}
