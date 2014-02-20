package com.pages.unity;

import java.io.IOException;

import org.sikuli.api.ImageTarget;
import org.sikuli.api.Relative;
import org.sikuli.api.ScreenLocation;
import org.sikuli.api.ScreenRegion;

import com.pictures.RaiderPictures;
import com.tools.AbstractActions;
import com.tools.constants.Constants;

public class RaiderShop extends AbstractActions{

	/**
	 * Menu Navigation - Buy Gems
	 * @throws IOException 
	 */
	public static void navigateBuyGems(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.BuyGems), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.BuyGems));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}
	

	/**
	 * Menu Navigation - Buy Items
	 * @throws IOException 
	 */
	public static void navigateBuyItems(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.BuyItems), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.BuyItems));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}

	/**
	 * Menu Navigation - Free Gems
	 * @throws IOException 
	 */
	public static void navigateFreeGems(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.FreeGemsMenu), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.FreeGemsMenu));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
		
	}
	
}
