package com.tools;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.UnityLoadPage;
import com.pages.unity.UnityScreens;

public class AbstractSteps extends ScenarioSteps{

	private static final long serialVersionUID = -2917865444900602964L;

	public AbstractSteps(Pages pages) {
		super(pages);
	}
	
	
	public UnityLoadPage unityLoadPage(){
		return getPages().currentPageAt(UnityLoadPage.class);
	}
	
	public UnityScreens unityScreens(){
		return new UnityScreens();
	}
		
}
