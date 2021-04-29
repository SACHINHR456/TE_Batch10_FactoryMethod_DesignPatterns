package com.te.templatemethod.template;

public abstract class GameTemplate {

public abstract  void	init() ;
public abstract  void	start();
public abstract  void	end();
	
public void play()
{
	init();
	start();
	end();
}
}
