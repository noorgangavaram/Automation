import org.openqa.selenium.By;

public class Amazon_Login {
    By email = By.id("ap_email");
    By continue_btn = By.cssSelector("input.a-button-input");
    By conditions_Use = By.xpath("//a[contains(text(),\"Conditions of Use\")]");
    By Privacy = By.xpath("//a[contains(text(),\"Privacy Notice\")]");
    By create_account_btn = By.cssSelector("a#createAccountSubmit");
    By conditions = By.xpath("//a[contains(text(),\" Conditions of Use\")]");
    By help = By.xpath("//a[contains(text(),\"Help\")]");
}
