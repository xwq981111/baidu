package ShouJi;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a01 {
	@Test
	public void shouji(){
		System.setProperty("webdriver.firefox.bin", "D:\\Users\\admin\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver iphone = new FirefoxDriver();
		String url2="http://localhost:8080/mobile_mysql/index.jsp";
		iphone.get(url2);
		String a=iphone.getTitle();
		System.out.println(a);
		String b=iphone.getCurrentUrl();
		System.out.println(b);
	}

}
