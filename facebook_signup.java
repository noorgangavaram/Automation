import org.openqa.selenium.By;

public class facebook_signup {
    By firstname = By.id("u_0_b_Hk");
    By lastname = By.id("u_0_d_jt");
    By mobile = By.id("u_0_g_PZ");
    By password = By.xpath("//input[@id=\"password_step_input\"]");
    By female = By.xpath("//label[contains(text(),\"Female\")]");
    By male = By.xpath("//label[contains(text(),\"Male\")]");
    By custom = By.xpath("//label[contains(text(),\"Custom\")]");
    By pronoun = By.name("preferred_pronoun");
    By button_signup = By.id("u_0_s_+X");
    By account_link = By.xpath("//a[contains(text(),\"Already have an account?\")]");
//  By account_link1 = By.partialLinkText("Already have an account?");  // For link text
    By day = By.xpath("//select[@id=\"day\"]");
}