package com.pages.unity;

import java.io.IOException;

import org.sikuli.api.ImageTarget;
import org.sikuli.api.Relative;
import org.sikuli.api.ScreenLocation;
import org.sikuli.api.ScreenRegion;

import com.pictures.RaiderPictures;
import com.tools.AbstractActions;
import com.tools.constants.Constants;

public class HeroesScreen extends AbstractActions{


	
	/**
	 * Menu Navigation - Shields
	 * @throws IOException 
	 */
	public static void navigateToSheilds(){
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.ChooseShields), Constants.Wait_Time);
		ScreenRegion shields = game.find(new ImageTarget(RaiderPictures.ChooseShields));
		ScreenLocation shieldButton = Relative.to(shields).center().getScreenLocation();
		mouse.doubleClick(shieldButton);
	}
	
}
