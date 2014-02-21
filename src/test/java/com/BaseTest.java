package com;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.After;

import com.tools.AbstractSteps;
import com.tools.constants.Constants;

public class BaseTest {


    @ManagedPages(defaultUrl = Constants.DEFAULT_URL)
    public Pages pages;
    
	@Steps
	public AbstractSteps abstractSteps;
	
	@After
	public void printErrors(){
		abstractSteps.printErrors();
	}
}
