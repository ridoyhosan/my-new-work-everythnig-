package All.myyWorkTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToOpenNClose {
	public static WebDriver dr;
	
	
	
	
	
	public static void  opentDriver(String browserName) throws MalformedURLException  {
		String chrome ="chromedriver";
		String gecko ="geckodriver";
	    
	if (browserName.equals(chrome)) {
		System. setProperty("webdriver.chrome.driver", "/Users/mobarokhosan/DesKtop/chromedriver");
		 dr = new ChromeDriver();
		 dr.get("https://www.subway.com");
		 dr.manage().window().maximize();
		 //dr.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/nav[2]/ul[2]/li[1]/button")).click();

	}
	else if (browserName.equals(gecko)) {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		String huburl= "http://192.168.1.4:4444";
		dr= new RemoteWebDriver(new URL(huburl), options);
		dr.get("https://www.subway.com");
		 dr.manage().window().maximize();
		
	}

	else{
		System.out.println("what's up");
		
	}
			
		
		
	}
	
	
	
public static void closeTheDriver () throws InterruptedException {
	Thread.sleep(10);
		dr.close();
	}
	public static void quitDriver () throws InterruptedException {
		Thread.sleep(10);
		
		dr.quit();
	}
	
	
	

}
