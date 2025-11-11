import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))
        );
        usernameField.click();
        usernameField.sendKeys("Admin");

        WebElement passwordField = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))
        );
        passwordField.click();
        passwordField.sendKeys("admin123");

        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
        );
        submitButton.click();

        WebElement pimButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']"))
        );
        pimButton.click();

        WebElement searchUserButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Type for hints...\"]"))
        );
        searchUserButton.click();
        searchUserButton.sendKeys("Charles");

        WebElement searchButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
        );
        searchButton.click();

        WebElement findUserButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space(text())='Charles']"))
        );
        findUserButton.click();

        WebElement contactDetailsButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space(text())='Contact Details']"))
        );
        contactDetailsButton.click();

        WebElement addAdressButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div/div/input[@class='oxd-input oxd-input--active']"))
        );
        addAdressButton.click();
        addAdressButton.sendKeys("Bucharest Blvd");

        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        saveButton.click();










    }
}