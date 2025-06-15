package com.cdac.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	@Test
	public void page_should_load() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:8080/app");
		try { Thread.sleep(5000); } catch(Exception e) { }
		/*driver.findElement(By.id("loginLink")).click();
		driver.findElement(By.name("username")).sendKeys("majrul");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();*/
		String actual = driver.findElement(By.tagName("h1")).getText();
		String expected = "Hello and Welcome";
		assertEquals(expected, actual);
		driver.close();
	}
}