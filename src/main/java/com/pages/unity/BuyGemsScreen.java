package com.pages.unity;

import org.sikuli.api.ImageTarget;
import org.sikuli.api.Relative;
import org.sikuli.api.ScreenLocation;
import org.sikuli.api.ScreenRegion;

import com.pictures.RaiderPictures;
import com.tools.AbstractActions;
import com.tools.constants.Constants;

public class BuyGemsScreen extends AbstractActions{

	public static void buyGems2(){
		ScreenRegion game = getGameRegion();	
		game.wait(new ImageTarget(RaiderPictures.Gems2Dollar), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.Gems2Dollar));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}
	
	public static void buyGems5(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.Gems5Dollar), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.Gems5Dollar));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}
	
	public static void buyGems10(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.Gems10Dollar), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.Gems10Dollar));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}
	
	public static void buyGems20(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.Gems20Dollar), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.Gems20Dollar));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.doubleClick(shopButton);
	}

}
