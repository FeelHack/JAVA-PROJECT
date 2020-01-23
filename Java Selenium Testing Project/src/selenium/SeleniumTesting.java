package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Date-23/01/2019
 * 
 * Time Taken-1hour
 * 
 * Simple Java Selenium Testing Project
 * 
 * Tools Use -Core Java -Selenium Jar file(5 file) -Junit jar file(2 file)
 * -Chrome Driver (Version Must be same with your current Chrome Browser)
 * 
 * @author giveu
 *
 */

public class SeleniumTesting {

	WebDriver driver = null;

	/**
	 * setup() method is used to set chrome driver path
	 */
	@Before
	public void setUp() {

//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\giveu\\OneDrive\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	/**
	 * test() method is used to test particular things taking help of driver
	 */
	@Test
	public void test() {

		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("www.thenalanda.com");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.className("iUh30")).click();
	}

	/**
	 * close() method is used to close the driver operation
	 */
	@After
	public void close() {
		driver.close();
	}

	/**
	 * main() method is used to intialize all the member used in this class(JVM & Object )
	 * @param args
	 */
	public static void main(String[] args) {
		SeleniumTesting ob = new SeleniumTesting();
		ob.setUp();
		ob.test();
		ob.close();
	}
}
