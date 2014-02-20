package com.pages.unity;

import java.net.URL;

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

public class ItemsShop extends AbstractActions {

	static boolean foundIt = false;

	public static void buyItem(final URL pictureFile) {

		ScreenRegion smallRegion = getGameRegion();
		StateChangeListener l = new StateChangeListener() {

			public void stateChanged(StateChangeEvent event) {
				System.out.println(event.getScreenRegion() + "'s state is changed " + "from {" + event.getOldState() + "} " + " to {"
						+ event.getNewState() + "}");

				if (event.getNewState().toString().contains("pictureState")) {
					System.out.println("EvriKA!!!!!!");
					foundIt = true;
					
				}
			}
		};

		Target pictureState = new ImageTarget(pictureFile);
		smallRegion.addState(pictureState, "pictureState");
		smallRegion.addStateChangeEventListener(l);
		
		while (!foundIt) {
			UnityScreens.swapAbove();
		}
		
		clickItem(pictureFile);
		
		UnityScreens.swapAbove();
		clickBuyButton();
	}

	private static void clickItem(URL pictureFile) {
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(pictureFile), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(pictureFile));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.click(shopButton);
	}

	private static void clickBuyButton() {
		ScreenRegion game = getGameRegion();
		game.wait(new ImageTarget(RaiderPictures.BuyButton), Constants.Wait_Time);
		ScreenRegion shop = game.find(new ImageTarget(RaiderPictures.BuyButton));
		ScreenLocation shopButton = Relative.to(shop).center().getScreenLocation();
		mouse.click(shopButton);
	}
}
