package com.tyss.dp.factoryMethod;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
 
		return new HtmlButton();
	}

}
