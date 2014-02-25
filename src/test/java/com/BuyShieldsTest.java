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
public class BuyShieldsTest{
	
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.DEFAULT_URL)
    public Pages pages;
    
    @Steps
    private HomeSteps homeSteps;

	@Test
	public void swapHeroTest() throws IOException{
		
		homeSteps.waitForUnity();
		
		homeSteps.clickOnHeroes();
		
		homeSteps.verifyHeroesTitle();
		
		homeSteps.navigateToShields();
		
		homeSteps.swapUpRight();
		
		homeSteps.swapUpRight();
		
		homeSteps.swapDownRight();
		
		homeSteps.swapDownRight();
		
		homeSteps.verifyHero();
		
		
	
	}
}
