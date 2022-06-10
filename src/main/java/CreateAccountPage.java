import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    WebDriver driver;
    private final By emailBox = By.xpath("//*[@id=\"email_create\"]");
    private final By createButton = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    private final By validateEmail = By.xpath("//*[@class=\"form-group form-error\"]");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean emailSend(String emailAddress) {
        driver.findElement(emailBox).sendKeys(emailAddress, Keys.TAB);
        try {
            driver.findElement(validateEmail);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public RegisterPage clickCreateAccountButton() {
        driver.findElement(createButton).click();
        return new RegisterPage(driver);
    }
}
