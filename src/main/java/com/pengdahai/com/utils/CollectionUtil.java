package com.pengdahai.com.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @作者: sea
 * @时间: 2019年4月22日
 * 集合工具类
 */
public class CollectionUtil {

//	方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Collection<?> coll){
	    //实现代码
		if(coll.size()!=0 && coll!=null) {
			return true;
		}
		return false;
	}
//	方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<?, ?> map){
	    //实现代码
		Set<?> set = map.entrySet();
		
		if(map.get(set)==null || map.isEmpty()) {
			
			return false;
		}
		return true;
	}
	
	@Test
	public void atest() {
//		Map<String, String> map = new HashMap();
//		map.put("a", "");
//		boolean empty = notEmpty(map);
//		System.out.println(empty);
		
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		boolean empty = notEmpty(list);
		System.out.println(empty);
	}
}
