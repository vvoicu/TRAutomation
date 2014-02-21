package com.tools;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.Relative;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;
import org.sikuli.api.visual.ScreenPainter;

import com.pictures.RaiderPictures;
import com.tools.constants.Constants;

public class AbstractActions {
	public static ScreenRegion screen = new DesktopScreenRegion();
	public static Canvas canvas = new DesktopCanvas();
	public static Mouse mouse = new DesktopMouse();
	public static Keyboard keyboard = new DesktopKeyboard();
	public static ScreenPainter painter = new ScreenPainter();
		
	
	public static ScreenRegion getGameRegion(){
		screen.wait(new ImageTarget(RaiderPictures.PageReference), Constants.Wait_Time);
		ScreenRegion shop = screen.find(new ImageTarget(RaiderPictures.PageReference));
		
		ScreenRegion gameScreen = Relative.to(shop).below(800).getScreenRegion();
//		painter.box(gameScreen, 5000);
		
		return gameScreen;
	}
	
	/**
	 * Will return the region where the hero is displayed in the main menu.
	 * @return
	 */
	public static ScreenRegion getHeroDisplay(){
		screen.wait(new ImageTarget(RaiderPictures.PageReference), Constants.Wait_Time);
		ScreenRegion shop = screen.find(new ImageTarget(RaiderPictures.PageReference));
		ScreenRegion gameScreen = Relative.to(shop).below(300).getScreenRegion();
		
		ScreenRegion heroScreen = Relative.to(gameScreen).below(280).getScreenRegion();
//		painter.box(heroScreen, 5000);
		
		return heroScreen;
	}
}
