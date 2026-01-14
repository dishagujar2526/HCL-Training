package AssignmentFive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travel_Login_Test {

    @Test
    public void travelLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://travel-demo.com");

        driver.findElement(By.id("email")).sendKeys("user@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("login")).click();

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
        driver.quit();
    }
}
