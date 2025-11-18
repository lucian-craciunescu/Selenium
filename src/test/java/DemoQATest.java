import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQATest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");

        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]"));
        element.click();

        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        textBox.click();

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        userName.click();
        userName.sendKeys("Lucian-Mihai Craciunescu");


        WebElement userEmail = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        userEmail.click();
        userEmail.sendKeys("lucian.mihai.craciunescu@gmail.com");

        WebElement adress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        adress.click();
        adress.sendKeys("Cluj Romania");

        WebElement permanentAdress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"permanentAddress\"]")));
        permanentAdress.click();
        permanentAdress.sendKeys("Cluj Romania");


        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();

        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
        checkBox.click();

        WebElement expand = driver.findElement(By.xpath("//button[@aria-label='Toggle' and @title='Toggle' and @type='button']"));
        expand.click();

        WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
        desktop.click();

        WebElement downloads = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]"));
        downloads.click();

        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
        radioButton.click();

        WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label"));
        impressive.click();
    }

}
