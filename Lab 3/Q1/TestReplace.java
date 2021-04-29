/**************** TestReplace.java **************/
import org.junit.*;
public class TestReplace {
	
	public TestReplace(){}
	
@Test
public void testInIsNull() {
String[] same = { "I" };
String[] displace = { "You" };
 Assert.assertNull (Use.replace( null, same , displace));
}

@Test
public void testSameIsNull() {
String[] first = { "I", "know" };
String[] displace = { "You" };
Assert.assertNull (Use.replace( first, null, displace ));
}

@Test
public void testDisplaceIsNull() {
String[] first = { "I", "know" };
String[] same = { "I" };
 Assert.assertNull (Use.replace( first, same , null ) );
}

@Test
public void testInAndSameAreNull() {
String[] displace = { "You" };
Assert.assertNull (Use.replace( null, null, displace ));
}

@Test
public void testInAndDisplaceAreNull() {
String[] same= { "I" };
 Assert.assertNull (Use.replace( null, same, null ) );
}

@Test
public void testSameAndDisplaceAreNull() {
String[] text = { "I", "know" };
 Assert.assertNull (Use.replace( text, null, null ) );
}

@Test
public void testAllNull() {
 Assert.assertNull (Use.replace( null, null, null ) );
}

@Test
public void testNotSameLength() {
String[] first = { "I", "know" };
String[] same= { "I" };
String[] displace = { "You", "They" };
 Assert.assertNull (Use.replace( first, same, displace));
}


@Test
public void testNullInIn() {
String[] first = { "I", null };
String[] same= { "I" };
String[] displace = { "You" };
 Assert.assertNull (Use.replace( first, same, displace ) );
}

@Test
public void testNullInSame() {
String[] first = { "I", "know" };
String[] same= { "I", null };
String[] displace = { "You", "They" };
 Assert.assertNull (Use.replace( first, same, displace ) );
}
@Test
public void testNullInDisplace() {
String[] first = { "I", "know" };
String[] same= { "I", "We" };
String[] displace = { null, "They" };
 Assert.assertNull (Use.replace( first, same, displace ) );
}
@Test
public void testNoChange() {
String[] first = { "I", "know" };
String[] same= { "You" };
String[] displace = { "I" };
String[] result = Use.replace( first, same, displace );
Assert.assertNotNull(result );
Assert.assertFalse(first == result );
Assert.assertTrue(first.length == result.length );
for ( int i=0; i<first.length; i++ ) {
 Assert.assertEquals (first[ i ], result[ i ] );
}
}

@Test
public void testChange() {
String[] first = { "I", "know" };
String[] same = { new String( "know" ) };
String[] displace = { "see" };
String[] expected = { "I", "see" };
String[] result = Use.replace( first, same, displace );
Assert.assertNotNull( result );
Assert.assertFalse (first == result );
Assert.assertTrue (first.length == result.length );
for ( int i=0; i<first.length; i++ ) {
 Assert.assertEquals (expected[ i ], result[ i ] );
}
}

public static void main(String[] args) throws AssertionError{
	
	TestReplace test = new TestReplace();
	
	try{
	test.testInIsNull();
	}catch (AssertionError e){throw new NullPointerException("Test testInIsNull failed");}
	
	try{
	test.testSameIsNull();
	}catch (AssertionError e){throw new NullPointerException("Test testSameIsNull failed");}
	
	try{
	test.testSameIsNull();
	}catch (AssertionError e){throw new NullPointerException("Test testSameIsNull failed");}
	
	try{
	test.testDisplaceIsNull();
	}catch (AssertionError e){throw new NullPointerException("Test testDisplaceIsNull failed");}
	
	try{
	test.testInAndSameAreNull();
	}catch (AssertionError e){throw new NullPointerException("Test testInAndSameAreNull failed");}
	
	try{
	test.testInAndDisplaceAreNull();
	}catch (AssertionError e){throw new NullPointerException("Test testInAndDisplaceAreNull failed");}
	
	try{
	test.testSameAndDisplaceAreNull();
	}catch (AssertionError e){throw new NullPointerException("Test testSameAndDisplaceAreNull failed");}
	
	try{
	test.testAllNull();
	}catch (AssertionError e){throw new NullPointerException("Test testAllNull failed");}
	
	try{
	test.testNotSameLength();
	}catch (AssertionError e){throw new NullPointerException("Test testNotSameLength failed");}
	
	try{
	test.testNullInIn();
	}catch (AssertionError e){throw new NullPointerException("Test testNullInIn failed");}
	
	try{
	test.testNullInSame();
	}catch (AssertionError e){throw new NullPointerException("Test testNullInSame failed");}
	
	try{
	test.testNullInDisplace();
	}catch (AssertionError e){throw new NullPointerException("Test testNullInDisplace failed");}
	
	try{
	test.testNoChange();
	}catch (AssertionError e){throw new NullPointerException("Test testNoChange failed");}
	
	try{
	test.testChange();
	}
	catch (AssertionError e){throw new NullPointerException("Test testChange failed");}
	
	

	
}//end of main

}//end of class
/******************************************************************************/