package day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.get("http://techproeducation.com");
        System.out.println("Techproeducation Sayfa Basligi  :"+driver.getTitle()); //bu method sayfanin basligini verir

        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());// bu methodla gidilen sayfanin Url ini verir

        //getPageSource() Acilan sayfanin kaynak kodlarini verir
        System.out.println(driver.getPageSource());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık her çalıştırdığımızda konsola bütün kaynak kodlarını vereceği için


        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//156B7B83BB29C993FACBBE3CBBFDFD5F






    }
}

