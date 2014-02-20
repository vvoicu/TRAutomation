package com;

import java.io.IOException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.HomeSteps;
import com.tools.constants.Constants;

@RunWith(ThucydidesRunner.class)
public class BuyGemsTest{
	
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.DEFAULT_URL)
    public Pages pages;
    
    @Steps
    private HomeSteps homeSteps;

	@Test
	public void testBuyGems() throws IOException{
		
		homeSteps.waitForUnity();
		
		homeSteps.clickOnShop();
		
		homeSteps.verifyShopTitle();
		
		//Menus				
//		homeSteps.navigateFreeGems();

//		homeSteps.navigateBuyItems();
		
		homeSteps.navigateBuyGems();
		
		homeSteps.buyGems10();
		
		homeSteps.buyGems2();
		
		homeSteps.buyGems5();
		
		homeSteps.buyGems20();

	}
}
