package selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeloCan {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","/Users/ali/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz


    }
}
