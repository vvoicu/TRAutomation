package com.tools;

import org.apache.commons.lang3.StringUtils;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.UnityLoadPage;
import com.pages.unity.UnityScreens;

public class AbstractSteps extends ScenarioSteps{

	private static final long serialVersionUID = -2917865444900602964L;

	public StringBuffer verificationMessages = new StringBuffer();
	
	public AbstractSteps(Pages pages) {
		super(pages);
	}
	
	
	public UnityLoadPage unityLoadPage(){
		return getPages().currentPageAt(UnityLoadPage.class);
	}
	
	public UnityScreens unityScreens(){
		return new UnityScreens();
	}
	
	
	@Step
	public void printErrors(){
		verifyNoErrors(verificationMessages.toString());
	}
	
	@Step
	public void verifyNoErrors(String veriStr){
		junit.framework.Assert.assertTrue("Errors Count: " + StringUtils.countMatches(veriStr, "\n"), !veriStr.contains("\n"));
	}
	
		
}
