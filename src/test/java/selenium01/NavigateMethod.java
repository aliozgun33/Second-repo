package selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","/Users/ali/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Hepsiburada sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);
        //Tekrar amazon sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //Tekrar Hepsiburada sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
        //Son sayfada sayfayi yenileyelim
        driver.navigate().refresh();
        //Ve sayfayi kapatalim
        driver.close();

       /* Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim*/


    }
}
