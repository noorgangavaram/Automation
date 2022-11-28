import org.openqa.selenium.By;

public class Amazon {
    By amazon_logo = By.xpath("//a[@id=\"nav-logo-sprites\"]");
    By location_logo = By.id("nav-packard-glow-loc-icon");
    By address = By.id("glow-ingress-line2");
    By serchBar = By.cssSelector("input#twotabsearchtextbox");
    By Go_Serch_logo = By.xpath("//input[@value=\"Go\"]");
    By Returns = By.xpath("//span[contains(text(),\"Returns\")]");
    By Orders = By.xpath("//span[contains(text(),\"& Orders\")]");
    By cart = By.xpath("//a[@id=\"nav-cart\"]");
    By Hamburger_Menu = By.xpath("//i[@class=\"hm-icon nav-sprite\"]");
    By all = By.cssSelector("span.hm-icon-label");
    By sell = By.xpath("(//a[@class=\"nav-a\"])[1]");
    By Best_Seller = By.xpath("//a[contains(text(),\"Best Sellers\")]");
    By Todays_deal = By.linkText("Today's Deals");
    By Mobiles = By.xpath("//a[contains(text(),\"Mobiles\")]");
    By Customers_Service = By.xpath("//a[contains(text(),\"Customer Service\")]");
    By Electronics = By.linkText(" Electronics ");
    By Home_Kitchine = By.xpath("//a[contains(text(),\"Home & Kitchen\")]");
    By About_Us = By.xpath("//a[contains(text(),\"About Us\")]");
    By careers = By.xpath("//a[contains(text(),\"Careers\")]");
    By press_relese = By.xpath("//a[contains(text(),\"Press Releases\")]");
    By Amazon_science = By.partialLinkText("Science");
    By Facebook = By.xpath("//a[contains(text(),\"Facebook\")]");
    By Twitter = By.xpath("//a[contains(text(),\"Facebook\")]/parent::li/following-sibling::li/child::a"); //By using Relative-path
    By Instagram = By.xpath("//a[contains(text(),\"Twitter\")]/parent::li/following-sibling::li/child::a"); //By Usinn relative-path
    By Sell_under_Amazon_Accelerator = By.linkText("Sell under Amazon Accelerator");
}