package com.tyss.dp.factoryMethod;

public class HtmlButton implements Button {

	@Override
	public void rendering() {
System.out.println("<button>Test Button</button>");	
onClicking();
	}

	@Override
	public void onClicking() {
    System.out.println("onclicking will says hello world");
	}

}
