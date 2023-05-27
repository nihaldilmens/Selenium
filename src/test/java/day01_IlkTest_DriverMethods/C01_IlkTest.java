package day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe"); //sistem özelliklerine yeni ayar getirdik
        // map //driverin yolunu göstermek icin kullandik //java uygulamalarinda system özelliklerini ayarlamak icin setProperty methodu ile kullaniriz

        System.out.println(System.getProperty("chromeDriver")); //getProperty ile "Key degerini girerek value ya ulasiriz
        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje olusturduk
        driver.get("https://techproeducation.com/"); //bu methodla String olarak girilen url e gideriz

















    }
}
