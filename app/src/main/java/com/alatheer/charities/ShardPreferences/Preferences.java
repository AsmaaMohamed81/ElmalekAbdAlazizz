package com.alatheer.charities.ShardPreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by elashry on 01/08/2018.
 */

public class Preferences {
    private static Preferences instance=null;

    private Preferences() {
    }

    public static synchronized Preferences getInstance()
    {
        if (instance==null)
        {
            instance = new Preferences();
        }
        return instance;
    }
    public void Create_Updata_user_data(Context context,String user_data)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user_data",user_data);
        editor.apply();
    }
    public void ClearPref(Context context)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
    public void Create_Updata_Session(Context context,String session)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("session",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("session",session);
        editor.apply();
    }
}
