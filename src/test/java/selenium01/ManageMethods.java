package selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","/Users/ali/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        /*Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfayi simge durumuna getirin
simge durumunda 3 saniye bekleyip sayfayi maximize yapin
Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
Sayfayi fullscreen yapin
Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
Sayfayi kapatin*/

        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.manage().window().getPosition());// Consola yazdirmak icin sout attik
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.close();

    }
}
