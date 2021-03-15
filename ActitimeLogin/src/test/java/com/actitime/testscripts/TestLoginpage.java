package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.codeninja.objectrepository.LoginpagePom;


public class TestLoginpage {
	static {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

	}

@Test
public void TestLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		LoginpagePom lp=new LoginpagePom(driver);
		lp.setLogin("admin", "manager");

}}
