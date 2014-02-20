package com.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;

import com.tools.AbstractPage;
import com.tools.constants.GeneratedFiles;

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
		File theDir = new File(GeneratedFiles.RootFolder);

		  if (!theDir.exists()) {
		    System.out.println("creating directory: " + GeneratedFiles.RootFolder);
		    boolean result = theDir.mkdir();  

		     if(result) {    
		       System.out.println("DIR created");  
		     }
		  }
	}
	
}
