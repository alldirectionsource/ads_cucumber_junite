package com.ads.steps;

import org.junit.Assert;

import com.ads.pages.HomePage;
import com.ads.pages.LoginPage;
import com.ads.utility.ConfigProperty;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePagesteps extends adsWebStep {
	private static HomePage homeIndexPage = null;
	ConfigProperty property = new ConfigProperty();
	public HomePagesteps(BrowserDI driver) {
		super(driver);
		homeIndexPage = new HomePage(browser);
	}

	
	
}