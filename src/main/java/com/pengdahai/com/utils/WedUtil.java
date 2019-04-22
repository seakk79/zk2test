package com.pengdahai.com.utils;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

/**
 * @作者: sea
 * @时间: 2019年4月22日
 * 
 */
public class WedUtil {

//	方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public boolean getString(HttpServletRequest request, String name, String defaultValue){
	    //实现代码
		String string = request.getParameter(name);
		if(string==null) {
			return Boolean.parseBoolean(defaultValue);
		}
		return true;
	}
	
	
//	方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name){
	    //实现代码
		int defaultValue=0;
		String parameter = request.getParameter(name);
		if(parameter==null) {
			return defaultValue;
		}
		return Integer.parseInt(parameter);
	}
	
//	方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request, String name){
	    //实现代码
		String parameter = request.getParameter(name);
		if(parameter==null) {
			return false;
		}
		return true;
		
	}
//	方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String string = request.getRequestURI();
		return string;
	}
	
	
//	方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(HttpServletRequest request){
	    //实现代码
		String string = getCookieValue(request);
		return string;
	}
}
