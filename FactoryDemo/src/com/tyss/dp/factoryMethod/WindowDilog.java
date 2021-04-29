package com.tyss.dp.factoryMethod;

public class WindowDilog  extends Dialog{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
