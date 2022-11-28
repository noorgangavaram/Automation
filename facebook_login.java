import javax.swing.plaf.synth.SynthDesktopIconUI;
import org.openqa.selenium.By;

class facebook_login{
    By email = By.id("email");
    By password = By.name("pass");
    By login_btn = By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy");
    By link = By.xpath("//a[contains(text(),\"Forgotten account?\")]");
    By sign_up = By.xpath("//a[contains(text(),\"Sign up for Facebook\")]");
    By signUp = By.cssSelector("a._97w5");
}


