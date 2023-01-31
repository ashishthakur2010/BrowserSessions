package sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        try {
            // Navigate to Url
            driver.navigate().to("https://www.naukri.com/");

            driver.findElement(By.id("login_Layer")).click();
            driver.findElement(By.xpath("//input[@value='']")).clear();
            driver.findElement(By.xpath("//input[@value='']")).sendKeys("mondalputul93@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).clear();
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aooale@12");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/a[1]/div[2]/div[1]")).click();
            driver.findElement(By.xpath("//div[@id='lazyResumeHead']/div/div/div/div/span[2]")).click();
            driver.findElement(By.id("resumeHeadlineTxt")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CANCEL'])[3]/following::button[1]")).click();
            driver.findElement(By.xpath("//div[@id='ni-gnb-header-section']/div[3]/div[2]/div[3]/div")).click();
            driver.findElement(By.linkText("Logout")).click();

        } finally {
            driver.quit();
        }
    }

}