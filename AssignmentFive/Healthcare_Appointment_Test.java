package AssignmentFive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Healthcare_Appointment_Test {

    @Test
    public void bookAppointment() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hospital-demo.com");

        driver.findElement(By.id("doctor")).sendKeys("Dr. Sharma");
        driver.findElement(By.id("book")).click();

        Assert.assertTrue(driver.getPageSource().contains("Appointment Confirmed"));
        driver.quit();
    }
}
