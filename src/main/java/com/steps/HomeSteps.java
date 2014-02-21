package com.steps;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

import org.apache.commons.lang3.RandomStringUtils;

import com.pages.unity.BuyGemsScreen;
import com.pages.unity.ItemsShop;
import com.pages.unity.RaiderShop;
import com.pages.unity.UnityScreens;
import com.tools.AbstractActions;
import com.tools.AbstractSteps;
import com.tools.constants.Constants;

public class HomeSteps extends AbstractSteps{

	public HomeSteps(Pages pages) {
		super(pages);
	}
	
	private static final long serialVersionUID = -9163444128868332168L;

	
	public void generateScreen() throws IOException{
		String fileName = RandomStringUtils.random(14, true, true) + ".png";
		
		File file = new File(Constants.RootFolder + fileName);
		String myDirtyString = "<html><body><img border=\"0\" src=\"" + file.getAbsolutePath() + "\" width=\"600\" height=\"800\"></body></html>";
		
		ImageIO.write(AbstractActions.getGameRegion().capture(), "png", new File(Constants.RootFolder + fileName));
		screenshotCapture(myDirtyString);
	}
	
	
	@Step
	@Screenshots(forEachAction=false)
	public void getGameScreen(){
		UnityScreens.getGameRegion();
	}
	
	@Step
	@Screenshots(onlyOnFailures=false)
	public void screenshotCapture(String file){
		System.out.println("Picture added to report...");
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void waitForUnity(){
		unityLoadPage().waitForUnity();
		UnityScreens.getUnityStates();
		waitABit(Constants.STEP_WAIT);
		unityLoadPage().setupRootFolder();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void clickOnShop() throws IOException{	
		UnityScreens.clickOnShop();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void clickOnHeroes() throws IOException{	
		UnityScreens.clickOnHeroes();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void clickOnSocial() throws IOException{	
		UnityScreens.clickOnSocial();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void clickOnMissions() throws IOException{	
		UnityScreens.clickOnMissions();
		generateScreen();
	}
	
	@Step 
	@Screenshots(forEachAction=true)
	public void verifyShopTitle() throws IOException{
		UnityScreens.verifyShopTitlePresence();
		generateScreen();
	}
	
	@Step 
	@Screenshots(forEachAction=true)
	public void verifyHeroesTitle() throws IOException{
		UnityScreens.verifyHeroesTitlePresence();
		generateScreen();
	}
	
	@Step 
	@Screenshots(forEachAction=true)
	public void verifySocialTitle() throws IOException{
		UnityScreens.verifySocialTitlePresence();
		generateScreen();
	}
	
	@Step 
	@Screenshots(forEachAction=true)
	public void verifyMissionsTitle() throws IOException{
		UnityScreens.verifyMissionsTitlePresence();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void navigateBuyGems() throws IOException{
		RaiderShop.navigateBuyGems();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void navigateBuyItems() throws IOException{
		RaiderShop.navigateBuyItems();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void navigateFreeGems() throws IOException{
		RaiderShop.navigateFreeGems();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void buyGems2() throws IOException{
		BuyGemsScreen.buyGems2();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void buyGems5() throws IOException{
		BuyGemsScreen.buyGems5();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void buyGems10() throws IOException{
		BuyGemsScreen.buyGems10();
		generateScreen();
	}
	
	@Step
	@Screenshots(forEachAction=true)
	public void buyGems20() throws IOException {
		BuyGemsScreen.buyGems20();
		generateScreen();
	}
	
	@Step
	public void swapHero() throws IOException{
		UnityScreens.swapRight();
		generateScreen();
	}
	
	@Step
	public void swapUp()throws IOException{
		UnityScreens.swapAbove();
		generateScreen();
	}
	
	@Step
	public void swapDown()throws IOException{
		UnityScreens.swapBottom();
		generateScreen();
	}
	
	@Step
	public void buyItem(URL itemPicture) throws IOException{
		ItemsShop.buyItem(itemPicture);
		generateScreen();
	}
	
	@Step
	public void swapUpLeft() throws IOException{
		UnityScreens.swapUp();
		generateScreen();
	}
	
	@Step
	public void swapDownLeft() throws IOException{
		UnityScreens.swapDown();
		generateScreen();
	}
}
