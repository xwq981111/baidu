package testBaidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


@Test
public class testBaidu {
	public void open(){
		System.setProperty("webdriver.firefox.bin", "D:\\Users\\admin\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String url1 = "https://www.baidu.com";
		driver.get(url1);//打开百度
		
		
	}

}
