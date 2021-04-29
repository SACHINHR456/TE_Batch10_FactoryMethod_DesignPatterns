package com.tyss.dp.factoryMethod;

public class DemoMain {
private static Dialog dialog;
	public static void main(String[] args) {

		configure();
		runBusinesLogic();
	}
  static void configure() {
	System.out.println( System.getProperty("os.name"));
	if( System.getProperty("os.name").equals("Windows 10")) {
	dialog =new WindowDilog();
	}else {
		dialog=new HtmlDialog();
	}
 }
  static void runBusinesLogic() {
		dialog.renderWindow(); 
 }
}
