package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driver.get() == null) {
			try {
				driver.set(createDriver());
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		
		WebDriver driver = null;
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") 
					+"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
		if (prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") 
						+"\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") 
						+"\\src\\main\\java\\drivers\\msedgedriver.exe");
			driver = new FirefoxDriver();
			
		} 
		else {
			
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") 
						+"\\src\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}
	
	public static void cleanupDriver() {
		driver.get().quit();
		driver.remove();
	}
	
}
