package com.app.util;

public class Const {
	
	public static String ONLINE_USER_LIST = "online_user_list"; // 在线用户列表
	public static String CURRENT_USER = "current_user";	// 当前用户
	
	public enum Type{
		NOT_LOGIN("not_login");
		
		private final String value ;
		Type(String value){
			this.value = value;
		}
		public String getValue(){
			return value;
		}
	}
}