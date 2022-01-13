package HwClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HwLessonEight {
    private static WebDriver driver;

    @Test//q1
    public static void Test1_OpenChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");
    }

@Test//q2
public void test2_GoogleTranslate(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("https://translate.google.com");
    System.out.println(driver.findElement(By.className("er8xn")));
    System.out.println(driver.findElement(By.cssSelector("textarea[role=combobox]")));
}
@Test//q3
    public void test3_Youtube(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("https://www.youtube.com");
    System.out.println(driver.findElement(By.id("logo-icon")));
    }
    @Test//q4
    public void test4_Selenium(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.seleniumhq.org");
        System.out.println(driver.findElement(By.className("form-control")));
        driver.findElement(By.className("form-control")).sendKeys("Selenium");
    }
    @Test//q5
    public void test5_Amazon() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.getTitle();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather Shoes");
    }
    @Test//q6
    public void test6_GoogleTranslate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
        driver.findElement(By.className("er8xn")).sendKeys("שלום");
    }
    @Test//q7
    public void test7_Youtube() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noa\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("Alan Walker");
        driver.findElement(By.cssSelector("button[aria-label=Search")).click();
        
    }

}
