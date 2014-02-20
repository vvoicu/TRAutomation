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

import com.pictures.RaiderPictures;
import com.tools.constants.Constants;

public class AbstractActions {
	public static ScreenRegion screen = new DesktopScreenRegion();
	public static Canvas canvas = new DesktopCanvas();
	public static Mouse mouse = new DesktopMouse();
	public static Keyboard keyboard = new DesktopKeyboard();
//	static ScreenPainter painter = new ScreenPainter();
		
	
	public static ScreenRegion getGameRegion(){
		screen.wait(new ImageTarget(RaiderPictures.PageReference), Constants.Wait_Time);
		ScreenRegion shop = screen.find(new ImageTarget(RaiderPictures.PageReference));
		
		ScreenRegion gameScreen = Relative.to(shop).below(800).getScreenRegion();
//		painter.box(gameScreen, 5000);
		
		return gameScreen;
	}
}
