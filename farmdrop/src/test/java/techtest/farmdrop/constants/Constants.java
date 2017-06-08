package techtest.farmdrop.constants;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Constants {

	public final static String DEVICE_NAME = "iPhone 6";;
//	public final static String PLATFORM_VERSION = "10.2";
	public final static String PLATFORM_VERSION = "9.2";
	public final static String BROWSER_NAME = "";
	public final static String PLATFORM_NAME = "iphone";
	public final static String APP_PATH = "/Users/jamesgould/Desktop/deploy20170119-16197-o5m7dv/Payload/Farmdrop.app";
	public final static String BUNDLE_ID = "Farmdrop";
//	public final static String UDID_ID = "d0d356bf32090885f60777853cd7d0f32bbccfa6";
	
	@iOSFindBy(accessibility="Products") public IOSElement productsScreen;
	@iOSFindBy(accessibility="Reciepes") public IOSElement reciepesScreen;
	@iOSFindBy(accessibility="Account") public IOSElement accountScreen;
	@iOSFindBy(accessibility="Basket") public IOSElement basketScreen;
	
}
