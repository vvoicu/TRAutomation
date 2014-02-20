package com.pages;

import java.io.File;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;
import com.tools.constants.Constants;

public class UnityLoadPage extends AbstractPage{

	public UnityLoadPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "unityPlayer")
	private WebElement unityContainer;
	
	public void waitForUnity(){
		element(unityContainer).waitUntilVisible();
		getDriver().manage().window().maximize();
	}

	public void setupRootFolder() {
		File theDir = new File(Constants.RootFolder);

		  if (!theDir.exists()) {
		    System.out.println("creating directory: " + Constants.RootFolder);
		    boolean result = theDir.mkdir();  

		     if(result) {    
		       System.out.println("DIR created");  
		     }
		  }
	}
	
}
