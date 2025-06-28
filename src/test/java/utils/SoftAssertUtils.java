package utils;
import org.testng.asserts.SoftAssert;
public class SoftAssertUtils {
	
	private SoftAssert softAssert = new SoftAssert();
	private boolean hasSoftFailure=false;

	public void assertEquals(Object actual, Object expected, String message) {
		try {
			softAssert.assertEquals(actual,expected,message);
		}catch(AssertionError ae) {
			System.out.println(ae.getMessage());
			hasSoftFailure=true;
		}	
	}
	public void assertTrue(boolean condition, String message) {
		try {
			softAssert.assertTrue(condition,message);
		}catch(AssertionError ae) {
			System.out.println(ae.getMessage());
			hasSoftFailure=true;
		}
	}
	public boolean hasSoftFailures() {
		return hasSoftFailure;
	}
	public void assertAll() {
		softAssert.assertAll();
		hasSoftFailure=false;
	}
	

}
