package com.unicss.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtil {
	/**
	 * 判断字符串是否为空或null
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		str = str == null?"":str.trim();
		return str.equals("");
	}
	
	/**
	 * 去除字符串两边的空格
	 * @param str
	 * @return
	 */
	public static String trim(String str){
		str = str ==null?"":str.trim();
		return str;
	}
	
	public static String trim(Object obj){
		String str = String.valueOf(obj);
		return trim(str);
	}
	
	public static String trimToNull(Object obj) {
		String str = String.valueOf(obj);
		str = (str == null) ? null : str.trim();
		return str;
	}
	
	/**
	 *字符串去重,如果字符串为空返回默认值 
	 * @param value
	 * @param defaultValue
	 * @return
	 */
	public static String trim(String str,String defaultValue){
		if(!isBlank(str)){
			return str.trim();
		}
		return defaultValue;
	}
	/**
	 * 三元运算式
	 * @param str
	 * @param isEqulsStr
	 * @param value
	 * @param otherValue
	 * @return
	 */
	public static Object docode(String input,String value,Object result,Object defaultResult){
		input=trim(input);
		value=trim(value);
		return input.equals(value)?result:defaultResult;
	}
	/**
	 * 三元表达式
	 * @param express 返回值为boolean的表达式
	 * @param result  返回结果为true的结果
	 * @param defaultResult  返回结果为false的结果
	 * @return
	 */
	public static String decode(boolean express,String result,String defaultResult){
		return express?result:defaultResult;
	}
	/**
	 * 字符串如果为空字符串，NULL，或"null" 则返回false 否则为true
	 * @param str
	 * @return
	 */
	public static boolean isPresent(String str){
		str = StringUtil.trim(str);
		if(!"".equals(str)&&!"null".equals(str.toLowerCase())){
			return true;
		}
		return false;
	}
	

	
	/**
	 * add by jcy 20121023
	 *  精确除法整数
	 * @param divsor 除数
	 * @param divdend 被除数
	 * @return
	 */
	public static String divide(String dividend,String divisor){
		divisor = StringUtil.trim(divisor, "0");
		dividend = StringUtil.trim(dividend,"0");
		double arg1 = Double.valueOf(dividend);
		double arg2 = Double.valueOf(divisor);
		String result = "0";
		if(arg1!=0){
			double re = arg2/arg1;
			result = StringUtil.scale(new BigDecimal(re),4);
		}
		return result;	
	}
	/**
	 * add by jcy 20121023
	 * 精确减法运算
	 * @param minuend 被减数
	 * @param subtrahend 减数
	 * @return
	 */
	public static int subtract(String minuend,String subtrahend){
		BigDecimal arg0 = new BigDecimal(minuend);
		BigDecimal arg1 = new BigDecimal(subtrahend);
		return arg0.subtract(arg1).intValue();
	}
	
	public static String scale(BigDecimal decimal,int scale){
		decimal = decimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
		return decimal.toString();
	}

	
	public static boolean isMatchDate(String dateStr){
		String datePattern = "^(?:([0-9]{4}-(?:(?:0?[1,3-9]|1[0-2])-(?:29|30)|"
            + "((?:0?[13578]|1[02])-31)))|"
            + "([0-9]{4}-(?:0?[1-9]|1[0-2])-(?:0?[1-9]|1\\d|2[0-8]))|"
            + "(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|"
            + "(?:0[48]00|[2468][048]00|[13579][26]00))-0?2-29)))$";
		Pattern p = Pattern.compile(datePattern);
		return p.matcher(dateStr).matches();
	}
	
	public static boolean isNumber(String str){
		str = trim(str);
		String datePattern = "^[0-9]+$";
		Pattern p = Pattern.compile(datePattern);
		return p.matcher(str).matches();
	}
   /**
    * 正则匹配	
    * @param str  要匹配的字符串
    * @param regex 表达式
    * @return
    */
   public static String[] grep(String str,String regex){
	  List<String> result = new ArrayList<String>();
	  Pattern p = Pattern.compile(regex);  
	  Matcher m = p.matcher(str);
	  while(m.find()){
		  result.add(m.group());
	  }
	   return result.toArray(new String[0]);
   }
   public static long strToLong(String str){
	   return !StringUtil.isBlank(str)&&StringUtil.isNumber(str.trim())?Long.parseLong(str.trim()):0L;
   }
   
   /**
	 * 将字符串的左侧填充某个值
	 * @param num
	 * @param scale
	 * @return
	 */
   public static String leftJoin(Object obj,int scale,String val){
   	String str = String.valueOf(obj);
	int len = str.length();
   	if(len<scale){
   		int diff = scale-len;
   		String prefix="";
   		for(int i=0;i<diff;i++){
   			prefix+=val;
   		}
   			str = prefix+str;
   	} 		
   	return str;
   }
  
   /**
	 * 把字符串转化成BigDecimal
	 * @param str
	 * @return
	 */
	public static BigDecimal toDecimal(String str){
		str = trim(StringUtil.isDouble(str)?str:"0","0");
		return new BigDecimal(str);
	}
	
	public static String numbericToString(String format,Object number){
		try{
			return new DecimalFormat(format).format(number);
		}catch(Exception e){
			return "0";
		}
	}
	public static String getBufferStr(List<String> listStr){
		StringBuffer buffer = new StringBuffer("");
		if(null != listStr && listStr.size() > 0){
			for(String str : listStr){
				buffer.append(str+" ");
			}
		}
		return buffer.toString();
	}
	public static boolean isDouble(String str){
		str = trim(str,"");
		String datePattern = "^[0-9]+(\\.)?[0-9]*$";
		Pattern p = Pattern.compile(datePattern);
		return !StringUtil.isBlank(str)&&p.matcher(str).matches();
	}

	public static String formatDot00(Double d) {
		String value="0";
		if(null!=d){
			DecimalFormat format=new DecimalFormat("0.00");
			value=format.format(d);
		}
		return value;
	}
}
