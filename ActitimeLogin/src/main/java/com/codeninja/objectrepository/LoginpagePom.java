package com.codeninja.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePom {
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwtbx;//declaration
@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;
public LoginpagePom(WebDriver driver)
{
	PageFactory.initElements(driver, this);//intialization
}
//Business logic method
public void setLogin(String un,String pw)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
