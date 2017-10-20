package com.shoot.mimi.common.utils;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


public class GeneralColumnEntityCodeUtils {

	public static void getGeneralEntityField(String columns){
		if(StringUtils.isBlank(columns)){
			return ;
		}
		String base ="private String ";
		List<String> columnList = Arrays.asList(columns.split("\\r\\n"));
		for(String column :columnList) {
			List<String> list = Arrays.asList(column.toLowerCase().trim().split("_"));
			String field = "";
			for(int i = 0;i<list.size();i++){
				if(i>0) {
					field += list.get(i).substring(0,1).toUpperCase()+list.get(i).substring(1);
				}else {
					field += list.get(i);
				}
			}
			System.out.println(base+field+";");
		}
	}
	
	public static void main(String[] args)  {
		String str="";
		getGeneralEntityField(str);
	}
}
