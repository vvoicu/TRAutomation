package com.pages.unity;

import java.io.IOException;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.Relative;
import org.sikuli.api.ScreenLocation;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.event.StateChangeEvent;
import org.sikuli.api.event.StateChangeListener;

import com.pictures.RaiderPictures;
import com.tools.AbstractActions;
import com.tools.constants.Constants;

public class UnityScreens extends AbstractActions{
	/**
	 * Will wait for the unity load screen 
	 */
	public static void getUnityStates(){
		DesktopScreenRegion smallRegion = new DesktopScreenRegion();
		StateChangeListener l = new StateChangeListener(){       				
			
			public void stateChanged(StateChangeEvent event) {
				System.out.println(event.getScreenRegion() + "'s state is changed " +
						"from {" + event.getOldState() + "} " +
						" to {" + event.getNewState() + "}");						
			}					
		};

		Target unityLogo = new ImageTarget(RaiderPictures.UnityLogo);
		Target shopButton = new ImageTarget(RaiderPictures.ShopButton);

		smallRegion.addState(unityLogo, "Loading Unity");
		smallRegion.addState(shopButton, "Unity is loaded!");
		
		smallRegion.addStateChangeEventListener(l);
	}
	
	/**
	 * Click on the Shop icon from the Main Menu
	 * @throws IOException
	 */
	public static void clickOnShop(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.ShopButton), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.ShopButton));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
		
	}
	
	/**
	 * After clicking on Shop - Verify Shop menu is opened
	 * @throws IOException
	 */
	public static void verifyShopTitlePresence(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.ShopTitle), Constants.Wait_Time);
		game.find(new ImageTarget(RaiderPictures.ShopTitle));
		
	}
	
	
	/**
	 * Click on the Heroes icon from the Main Menu
	 */
	public static void clickOnHeroes(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.HeroesButton), Constants.Wait_Time);
		ScreenRegion heroes = game.find(new ImageTarget(RaiderPictures.HeroesButton));
		ScreenLocation heroesButton = Relative.to(heroes).center().getScreenLocation();
		mouse.doubleClick(heroesButton);
	}
	

	/**
	 * After clicking on Heroes - Verify Heroes menu is opened
	 * @throws IOException
	 */
	public static void verifyHeroesTitlePresence(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.HeroesTitle), Constants.Wait_Time);
		game.find(new ImageTarget(RaiderPictures.HeroesTitle));
		
	}
	
	/**
	 * Click on the Social icon from the Main Menu
	 */
	public static void clickOnSocial(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.SocialButton), Constants.Wait_Time);
		ScreenRegion social = game.find(new ImageTarget(RaiderPictures.SocialButton));
		ScreenLocation socialButton = Relative.to(social).center().getScreenLocation();
		mouse.doubleClick(socialButton);
	}
	

	/**
	 * After clicking on Social - Verify Social menu is opened
	 * @throws IOException
	 */
	public static void verifySocialTitlePresence(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.SocialTitle), Constants.Wait_Time);
		game.find(new ImageTarget(RaiderPictures.SocialTitle));
		
	}
	
	/**
	 * Click on the Missions icon from the Main Menu
	 */
	public static void clickOnMissions(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.MissionsButton), Constants.Wait_Time);
		ScreenRegion missions = game.find(new ImageTarget(RaiderPictures.MissionsButton));
		ScreenLocation missionsButton = Relative.to(missions).center().getScreenLocation();
		mouse.doubleClick(missionsButton);
	}
	

	/**
	 * After clicking on Missions - Verify Missions menu is opened
	 * @throws IOException
	 */
	public static void verifyMissionsTitlePresence(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.MissionsTitle), Constants.Wait_Time);
		game.find(new ImageTarget(RaiderPictures.MissionsTitle));
		
	}
	
	
	/**
	 * Simulate Swap actions - (Like finger gestures)
	 */
	public static void swapRight(){
		ScreenRegion game = getGameRegion();
		ScreenLocation centerScreenStart = Relative.to(game).center().getScreenLocation();
		
		mouse.drag(centerScreenStart);
		mouse.drop(Relative.to(centerScreenStart).right(50).getScreenLocation());
	}
	
	/**
	 * Swap bottom action - Resulting action is reversed
	 */
	public static void swapBottom(){
		ScreenRegion game = getGameRegion();
		ScreenLocation centerScreenStart = Relative.to(game).center().getScreenLocation();
		
		mouse.drag(centerScreenStart);
		mouse.drop(Relative.to(centerScreenStart).below(150).getScreenLocation());
	}

	/**
	 * Swap above action - Resulting action is reversed
	 */
	public static void swapAbove(){
		ScreenRegion game = getGameRegion();
		ScreenLocation centerScreenStart = Relative.to(game).center().getScreenLocation();
		
		mouse.drag(centerScreenStart);
		mouse.drop(Relative.to(centerScreenStart).above(180).getScreenLocation());
	}

	public static void swapUp(){
		ScreenRegion game = getGameRegion();
		ScreenLocation centerScreenStart = Relative.to(game).center().getScreenLocation();
		ScreenLocation rightSideScreen = Relative.to(centerScreenStart).right(200).getScreenLocation();
		mouse.drag(rightSideScreen);
		mouse.drop(Relative.to(rightSideScreen).above(180).getScreenLocation());	
	}
	public static void swapDown(){
		ScreenRegion game = getGameRegion();
		ScreenLocation centerScreenStart = Relative.to(game).center().getScreenLocation();
		ScreenLocation rightSideScreen = Relative.to(centerScreenStart).right(200).getScreenLocation();
		mouse.drag(rightSideScreen);
		mouse.drop(Relative.to(rightSideScreen).below(150).getScreenLocation());	
	}
	
}
