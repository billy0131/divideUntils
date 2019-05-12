/**
 * 
 */
package com.min.test.utils;

import org.junit.Test;

import com.mini.test.DivideUtils;

import junit.framework.TestCase;

/**
 * @author 
 * @createdOn 2019年1月9日
 * @company 广州广之旅国际旅行社股份有限公司
 *
 */
public class DivideTest extends TestCase{
	
	
	
	@Test
	public void testDivideByThreeAndFive() {
		
		assertTrue("Fizz".equals(DivideUtils.getNameByNumType(33, false, true, null)));
		assertFalse("1".equals(DivideUtils.getNameByNumType(33, false, true, null)));
		assertTrue("Buzz".equals(DivideUtils.getNameByNumType(55, false, true, null)));
		assertTrue("FizzBuzz".equals(DivideUtils.getNameByNumType(15, false, true, null)));
		DivideUtils.getList("1");
	}
	
	@Test
	public void testDivideByThreeOrContainThree() {
		assertTrue(DivideUtils.checkName(3,3,3,true));
		assertTrue(DivideUtils.checkName(13,3,3,true));
		assertFalse(DivideUtils.checkName(22,3,3,true));
		DivideUtils.getList("2");
	}
	
	@Test
	public void testDivideByFiveOrContainFive() {
		assertTrue(DivideUtils.checkName(5,5,5,true));
		assertTrue(DivideUtils.checkName(51,5,5,true));
		assertFalse(DivideUtils.checkName(89,5,5,true));
		DivideUtils.getList("3");
	}
	
	@Test
	public void testDivideAbove() {
		assertTrue("Fizz".equals(DivideUtils.getNameByNumType(33, true, true, null)));
		assertFalse("1".equals(DivideUtils.getNameByNumType(33, true, true, null)));
		assertTrue("Buzz".equals(DivideUtils.getNameByNumType(55, true, true, null)));
		assertTrue("FizzBuzz".equals(DivideUtils.getNameByNumType(53, true, true, null)));
		assertTrue("FizzBuzz".equals(DivideUtils.getNameByNumType(35, true, true, null)));
		DivideUtils.getList("4");
	}

}
