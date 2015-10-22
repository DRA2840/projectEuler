package projectEuler;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test {
	
	//@org.junit.Test
	public void testAllProblems(){
		Assert.assertEquals(P001.calculateAnswer(), "233168");
		Assert.assertEquals(P002.calculateAnswer(), "4613732");
		Assert.assertEquals(P003.calculateAnswer(), "6857");
		Assert.assertEquals(P004.calculateAnswer(), "906609");
		Assert.assertEquals(P005.calculateAnswer(), "232792560");
		Assert.assertEquals(P006.calculateAnswer(), "25164150");
		Assert.assertEquals(P007.calculateAnswer(), "104743");
		Assert.assertEquals(P008.calculateAnswer(), "23514624000");
		Assert.assertEquals(P009.calculateAnswer(), "31875000");
		Assert.assertEquals(P010.calculateAnswer(), "142913828922");
		Assert.assertEquals(P011.calculateAnswer(), "70600674");
		Assert.assertEquals(P012.calculateAnswer(), "76576500");
		Assert.assertEquals(P013.calculateAnswer(), "5537376230");
		Assert.assertEquals(P014.calculateAnswer(), "837799");
		Assert.assertEquals(P015.calculateAnswer(), "137846528820");
		Assert.assertEquals(P016.calculateAnswer(), "1366");
	}
	
	@org.junit.Test
	public void testP001(){
		Assert.assertEquals(P001.calculateAnswer(), "233168");
	}
	
	@org.junit.Test
	public void testP002(){
		Assert.assertEquals(P002.calculateAnswer(), "4613732");
	}
	@org.junit.Test
	public void testP003(){
		Assert.assertEquals(P003.calculateAnswer(), "6857");
	}
	/*This test does not work if you're using Jacoco, but works in a normal maven build.
	 * TODO: Do this the right way =)
	 * */
//	@org.junit.Test
//	public void testP004(){
//		Assert.assertEquals(P004.calculateAnswer(), "906609");
//	}
	@org.junit.Test
	public void testP005(){
		Assert.assertEquals(P005.calculateAnswer(), "232792560");
	}
	@org.junit.Test
	public void testP006(){
		Assert.assertEquals(P006.calculateAnswer(), "25164150");
	}
	@org.junit.Test
	public void testP007(){
		Assert.assertEquals(P007.calculateAnswer(), "104743");
	}
	@org.junit.Test
	public void testP008(){
		Assert.assertEquals(P008.calculateAnswer(), "23514624000");
	}
	@org.junit.Test
	public void testP009(){
		Assert.assertEquals(P009.calculateAnswer(), "31875000");
	}
	@org.junit.Test
	public void testP010(){
		Assert.assertEquals(P010.calculateAnswer(), "142913828922");
	}
	@org.junit.Test
	public void testP011(){
		Assert.assertEquals(P011.calculateAnswer(), "70600674");
	}
	@org.junit.Test
	public void testP012(){
		Assert.assertEquals(P012.calculateAnswer(), "76576500");
	}
	@org.junit.Test
	public void testP013(){
		Assert.assertEquals(P013.calculateAnswer(), "5537376230");
	}
	@org.junit.Test
	public void testP014(){
		Assert.assertEquals(P014.calculateAnswer(), "837799");
	}
	@org.junit.Test
	public void testP015(){
		Assert.assertEquals(P015.calculateAnswer(), "137846528820");
	}
	@org.junit.Test
	public void testP016(){
		Assert.assertEquals(P016.calculateAnswer(), "1366");
	}
	@org.junit.Test
	public void testP017(){
		Assert.assertEquals(P017.calculateAnswer(), "21124");
	}

}
