package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilityConfig.UtilityFile;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Base()
	{
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(UtilityFile.FILE_LOCATION);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initializeBrowser()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\FrameworkPractice\\EaseMyTrip_E2E\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {

			driver = new InternetExplorerDriver();
			System.setProperty("webdriver.ie.driver",
					"D:\\Selenium\\FrameworkPractice\\POMHybridFramework" + "\\drivers\\IEServer.exe");

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium\\FrameworkPractice\\POMHybridFramework" + "\\drivers\\geckodriver.exe");

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
			System.setProperty("webdriver.edge.driver",
					"D:\\Selenium\\FrameworkPractice\\POMHybridFramework" + "\\drivers\\edgedriver.exe");

		} else {
			System.out.println("Please Check Your Browser. You have enter wrong browser......");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(UtilityFile.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilityFile.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
