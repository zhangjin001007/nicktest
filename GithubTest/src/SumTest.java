import junit.framework.Assert;

import org.junit.Test;


public class SumTest {
	@Test
	public void testSum(){
		Assert.assertEquals(10, HelloJenkins.sum(5, 5));
		Assert.assertEquals(10, HelloJenkins.sum(6, 4));
		Assert.assertEquals(10, HelloJenkins.sum(3, 7));
	}
	
	public static void main(String args[]){
		System.out.println(HelloJenkins.sum(5, 5));
	}
}
