package utils;

public class CommonMethods {
	
	
	public void rgbToHex(String rgbColorValue) {
		   String rgb = rgbColorValue.replace("rgb('","").replace(")'", "");
		   System.out.println(rgb);
		
	}

}
