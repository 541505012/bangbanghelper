package com.mero.wyt_register;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *@项目名称: 简易通注册助手
 *@文件名称: Config.java
 *@Date: 2016-7-14
 *@Copyright: 2016 Technology Mero Inc. All rights reserved.
 *注意：由Mero开发，禁止外泄以及使用本程序于其他的商业目的 。
 */
public class Config {
	public static final String ID="prefs";//当前应用的ID
	public static final String CHARSET="UTF-8";//编码格式
	public static final String DEBUGGING="T";//可调试开发阶段标志
	public static final String URL="www.haoma.com";//临时接码平台地址
	public static final String KEY_IS_FIRST_IN = "isFirstIn";
	public static final String KEY_IS_INSTALL_XPOSED = "isInstalledXposed";//是否安装XPOSED
	public static final String KEY_IS_MODULE_INSTALLED = "isInstalledModule";//是否已经安装MODULE
	public static final String KEY_STATUS = "status";//状态key
	public static final String KEY_TOKEN = "token";
	public static final boolean VALUE_TRUE = true;
	public static final boolean VALUE_FALSE = false;
	public static final String VALUE_IS_INSTALL = "已安装";
	public static final String VALUE_NOT_INSTALLED = "未安装";


	public void setTokenPreferences(Context context,String token){
		SharedPreferences sharedPreferences = context.getSharedPreferences(Config.ID,Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = 	sharedPreferences.edit();
		editor.putString(KEY_TOKEN,token);
		editor.commit();
	}

	public String getTokenFromPreferences(Context context){
		String token = "";
		SharedPreferences sharedPreferences  = context.getSharedPreferences(Config.ID,Context.MODE_PRIVATE);
		token = sharedPreferences.getString(KEY_TOKEN,null);
		return token;
	}
}
