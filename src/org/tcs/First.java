package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class First {
	public WebDriver driver;
	@BeforeClass
	public void Firstmethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a588871\\eclipse-workspace\\Testng\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	}
	
@Test
public void middlemethod() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("gopi");
	Thread.sleep(4000);

}
@AfterClass
public void finalmethod() {
	driver.quit();

}
}
