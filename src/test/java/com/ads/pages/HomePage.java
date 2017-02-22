package com.ads.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ads.steps.BrowserDI;
import com.ads.utility.ConfigProperty;
import com.ads.utility.lib;

//import com.capitalone.steps.ReportingOptions;

import java.net.URL;

public class HomePage extends adsWebPage {

	@FindBy(how = How.NAME, using = "txtuemail_txtfuname_uphonenumber")
	public WebElement objUserName;

	@FindBy(how = How.NAME, using = "txtupass")
	public WebElement objPassword;

	@FindBy(how = How.NAME, using = "btn-login")
	public WebElement objloginButton;

	@FindBy(how = How.CLASS_NAME, using = "btn-signup")
	public WebElement objSignInButton;

	@FindBy(how = How.CSS, using = "div.alert.alert-success")
	public WebElement objWarningMessage;

	// #########################################Updated for prod end
	// here##################

	public int setShort_Time = 2000;
	ConfigProperty property = new ConfigProperty();

	public HomePage(BrowserDI driver) {
		super(driver);
	}

	ConfigProperty Util = new ConfigProperty();
	int flg;

}
