package day02selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03LocatersGetMethods {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","/Users/ali/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazon sayfasina gidelim
        // Search bolumunu locate edip iphone aratalim
        // Arama sonuc yazisini konsola yazdiralim
        // And close the page
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtexbox")).sendKeys("iphone", Keys.ENTER);
       WebElement aramaSonucYazisi = driver.findElement(By.className("a-color-state a-text-bold"));
        System.out.println(aramaSonucYazisi.getText());
        driver.close();
        System.out.println("Aboooow");
    }
}
