package projectEuler;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test {
	
	@org.junit.Test
	public void testProblems(){
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

}
