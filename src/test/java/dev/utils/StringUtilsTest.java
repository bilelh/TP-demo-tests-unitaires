package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void TestlevenshteinDistance1() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue = stringUtils.levenshteinDistance("chat", "chats");
		Assert.assertEquals(1, valeurObtenue);
	}
	@Test
	public void TestlevenshteinDistance2() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue2 = stringUtils.levenshteinDistance("machine", "machine");
		Assert.assertEquals(0, valeurObtenue2);
	}
	@Test
	public void TestlevenshteinDistance3() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue3 = stringUtils.levenshteinDistance("avion", "avion ");
		Assert.assertEquals(1, valeurObtenue3);
	}
	@Test
	public void TestlevenshteinDistance4() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue4 = stringUtils.levenshteinDistance("chien", "chine");
		Assert.assertEquals(2, valeurObtenue4);
	}
	@Test
	public void TestlevenshteinDistance5() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue5 = stringUtils.levenshteinDistance("table", "tablette");
		Assert.assertEquals(3, valeurObtenue5);
	}
	@Test
	public void TestlevenshteinDistance6() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenue6 = stringUtils.levenshteinDistance("table", "");
		Assert.assertEquals(5, valeurObtenue6);
	}
	@Test(expected =NullPointerException.class)
	public void TestlevenshteinDistanceNull() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenueNull = stringUtils.levenshteinDistance(null, "stylo");
		Assert.assertEquals(6, valeurObtenueNull);
	}
	@Test(expected =NullPointerException.class)
	public void TestlevenshteinDistanceNull2() {
		StringUtils stringUtils = new StringUtils();
		int valeurObtenueNull = stringUtils.levenshteinDistance(null, null);
		Assert.assertEquals(6, valeurObtenueNull);
	}

}
