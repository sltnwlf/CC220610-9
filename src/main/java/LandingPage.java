import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;
    private final String url = "http://automationpractice.com/index.php";
    private final By singInButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(url);
    }

    public CreateAccountPage clickOnSignInButton() {
        driver.findElement(singInButton).click();
        return new CreateAccountPage(driver);
    }

}
