package com.mini.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideUtils {


	private static final String contain="[%s]{1,1}";

	public static void getList(String type){
		for(int i=1;i<=100;i++){
			if("1".equals(type)){
				System.out.println(getNameByNumType(i,false,true,null));
			}else if("2".equals(type)){
				if(checkName(i,3,3,true)){
					System.out.println("Fizz");
				}else{
					System.out.println(i+"");
				}
			}if("3".equals(type)){
				if(checkName(i,5,5,true)){
					System.out.println("Buzz");
				}else{
					System.out.println(i+"");
				}
			}if("4".equals(type)){
				System.out.println(getNameByNumType(i,true,true,null));
			}
		}
	}

	/**
	 * 
	 * @param i
	 * @param isContain 是否包含
	 * @param isMoreCondition 是否需要除以3或者除以5等2个以上的条件
	 * @return
	 */
	public static String getNameByNumType(int i,boolean isContain,boolean isMoreCondition,Integer onlyPrintNum){
		String result=i+"";
		if(checkName(i,3,3,isContain)&&checkName(i,5,5,isContain)&&isMoreCondition){
			result= "FizzBuzz";
			return result;
		}

		if(checkName(i,3,onlyPrintNum,isContain)){
			result= "Fizz";
			if(onlyPrintNum!=null){
				return result;
			}
		}
		if(checkName(i,5,onlyPrintNum,isContain)){
			result="Buzz";
			if(onlyPrintNum!=null){
				return result;
			}
		}
		return result;
	}

	/**
	 * 检察是否满足Buzz,Fizz,FizzBuzz
	 * @param i 数字
	 * @param type  包含的数字
	 * @param isContain   是否包含
	 * @return
	 */
	public static boolean checkName(int i,int divide,Integer type,boolean isContain){
		boolean result =false;
		if(i%divide==0){
			result=true;
			return result;
		}
		if(isContain&&type!=null&&divide==type){
			String containStr=contain;
			String contain=String.format(containStr, type+"");
			Pattern p = Pattern.compile(contain);
			Matcher m = p.matcher(i+"");
			if(m.find()){
				result=true;
				return result;
			}
		}
		return result;
	}


}
