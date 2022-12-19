package day02selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02WebElements {
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","/Users/ali/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazon sayfasina git
        driver.get("http://amazon.com");
        // Search bolumunu locate edelim
     //  WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtexbox"));
        WebElement aramaKutusu= driver.findElement(By.name("field-keywords"));

        // And Search bolumunde iphone aratalim
        aramaKutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir web elementi locate etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip inpect tilariz
        karsimiza html codlarindan locater (konum belirleyiciler) den essiz oan seceriz
        genellikle id attribute kullanilir.Sectigimiz attibute degerini findelement()
        methodun icine findelement(By.id("attribute degeri")) seklinde yazilir
        */
        // Amazon sayfasindan input ve <a> tag larinin sayisini yazdirin
        List<WebElement> inputTags= driver.findElements(By.tagName("input"));
        System.out.println("inputTags.size() = " + inputTags.size());
        List<WebElement> linklerList= driver.findElements(By.tagName("a"));
        System.out.println("linklerList.size() = " + linklerList.size());
        for (WebElement w:linklerList
             ) {
            System.out.println(w.getText());

        }


    }
}
