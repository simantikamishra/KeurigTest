package com.keurig.base;
import java.util.*;
import com.keurig.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Keurig {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Automation_NewFramework//Library//chromedriver.exe");
	     driver=new ChromeDriver();
         driver.get("https://www.keurig.com");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         utl.winPopUpClose();
	}

}
