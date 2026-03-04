package sto000501_backgroundsd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class BackgroundHooks 
{
	@Before
	public void beforeHooks()
	{
		System.out.println("Before Hooks Executed");
	}
	
	@BeforeStep
	public void beforeStepHooks()
	{
		System.out.println("Before Step Hooks Executed");
	}
	
	@After
	public void afterHooks()
	{
		System.out.println("After Hooks Executed");
	}
}
