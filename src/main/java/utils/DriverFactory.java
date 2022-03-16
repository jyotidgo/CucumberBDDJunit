package utils;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverFactory {
    public static Properties prop;
    public static Properties or;
    public static WebDriver driver;

    public static WebDriver getDriver()//to return the driver object
    {
        prop = new Properties();
        or = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fs = new FileInputStream("src/main/java/config/or.properties");
            or.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        BasePage.initPages();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
