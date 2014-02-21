package com;

import java.io.IOException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.HomeSteps;
import com.tools.constants.Constants;

@RunWith(ThucydidesRunner.class)
public class SwapHeroTest  extends BaseTest{
	
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    
    @Steps
    private HomeSteps homeSteps;

	@Test
	/**
	 * Will navigate through the main menu and swap heroes. It will also validate the current hero.
	 * @throws IOException
	 */
	public void swapHeroTest() throws IOException{
		
		homeSteps.waitForUnity();
		homeSteps.verifyHeroChange(Constants.HeroAstrid);
		homeSteps.swapHero();
		homeSteps.verifyHeroChange(Constants.HeroSven);
		homeSteps.swapHero();
		homeSteps.verifyHeroChange(Constants.HeroBjorn);
		homeSteps.swapHero();
		homeSteps.verifyHeroChange(Constants.HeroAstrid);

	}
}
