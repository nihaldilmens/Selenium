package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chore.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.de");

        //Sayfa basliginin Amazon icerdigini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");

        }else{
            System.out.println("Test FAILED");
        }

        //Url in  https://www.amazon.com oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.de";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");

        }else{
            System.out.println("Test Failed");
        }
        //Sayfayi kapatalim

        driver.close();
        //driver.quit(); -> Birden fazla browser varsa hepsini kapatir

    }
}
