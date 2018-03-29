package wsi.survey.util;

import android.content.SharedPreferences.Editor;
import wsi.survey.MobileApplication;

public class PreferenceUtil {
	
	public static void saveData(String key,String value){
		Editor editor = MobileApplication.mPref.edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	public static void saveData(String key,boolean value){
		Editor editor = MobileApplication.mPref.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
	public static void clear(String key){
		Editor editor = MobileApplication.mPref.edit();
		editor.putString(key, "");
		editor.commit();
	}
	
	public static String getData(String key){
		return MobileApplication.mPref.getString(key, "");
	}
	
	public static boolean getBooleanData(String key){
		return MobileApplication.mPref.getBoolean(key, false);
	}
	
	public static void clearBoolean(String key){
		Editor editor = MobileApplication.mPref.edit();
		editor.putBoolean(key, false);
		editor.commit();
	}
	
	
}
