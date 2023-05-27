package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chore.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu= " +driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari = " +driver.manage().window().getSize());

        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        //Bir web sitesine gittigimizde browser default olarak bir boyutta gelir. ve acilan browser daki webElementlere
        // browser maximize olmadigi icin ulasamayabiliriz Dolaysiyla browser i actiktan sonra maximiza yaparsak driver
        // bütün webElementleri görür ve rahatlikla müdahale edebilir bu yüzden browser i actiktan sonra ilk olarak
        // driver.manage().window().maximize(); yapmamız bizim webelementlere
        //ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        //tekrar //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu= " +driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari = " +driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayi fullScreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir


        //sayfayi kapatiniz
        driver.close();





    }
}
