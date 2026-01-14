package AssignmentFive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce_AddToCart_Test {

    @Test
    public void addToCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop-demo.com");

        driver.findElement(By.id("product1")).click();
        driver.findElement(By.id("addToCart")).click();

        String msg = driver.findElement(By.id("success")).getText();
        Assert.assertEquals(msg, "Product added");

        driver.quit();
    }
}
