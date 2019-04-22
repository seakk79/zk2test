package com.pengdahai.com.utils;

import org.junit.Test;

/**
 * @作者: sea
 * @时间: 2019年4月22日
 * 字符串工具类
 */
public class StringUtil {


//		方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
		public boolean hasLength(String src){
		    //实现代码	
			if(src.length()==0) {
				return false;
			}
			return true;
		}
		
		
		
//		方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
		public boolean hasText(String src){
		    //实现代码
			String trim = src.trim();
			if(trim.equals("")) {
				return false;
			}
			return true;
			
		}
		
		
		
		
//		方法3：判断是否为手机号码 (5分)
		public boolean isMobile(String src){
		    //实现代码
			String trim = src.trim();
			System.out.println(trim.length());
			if(trim.length()==11) {
				char[] cs = trim.toCharArray();
				if(cs[0]!='0') {
					for (int i = 0; i < cs.length; i++) {
						if(cs[i]>='0' && cs[i]<='9') {
							return true;
						}
					}
				}
				return false;
			}
			return false;
		}
		
		
		
	
		
		
		
//		方法4：判断是否为邮箱 (5分)
		public boolean isEmail(String src){
		    //实现代码
			
			String reg="[a-zA-Z0-9]+@(163.com || qq.com)";
			
			return true;
		}
		
		
	
		
		
		
//		方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		public String reverse(String src){
		    //实现代码
			StringBuffer buffer = new StringBuffer();
			
			buffer.append(src);
			StringBuffer buffer2 = buffer.reverse();
			return buffer2.toString();
		}
		
		@Test
		public void atest() {
		
		}
	}
	
	
	

