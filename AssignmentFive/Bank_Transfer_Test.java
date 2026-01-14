package AssignmentFive;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bank_Transfer_Test {

    @Test
    public void transferMoney() {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://bank-demo.com");

        driver.findElement(By.id("amount")).sendKeys("5000");
        driver.findElement(By.id("transfer")).click();

        String msg = driver.findElement(By.id("status")).getText();
        assertEquals("Transfer Successful", msg);

        driver.quit();
    }
}

