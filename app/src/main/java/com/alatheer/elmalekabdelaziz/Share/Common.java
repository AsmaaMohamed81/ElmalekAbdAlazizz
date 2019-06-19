package com.alatheer.elmalekabdelaziz.Share;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.alatheer.elmalekabdelaziz.Models.UserModel;
import com.google.gson.Gson;

import java.io.File;

/**
 * Created by elashry on 01/08/2018.
 */

public class Common {

    public static void CloseKeyBoard(Context context, View view)
    {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
    public static String ConvertModel_To_Gson(UserModel userModel)
    {
        Gson gson = new Gson();
        return gson.toJson(userModel);
    }
    public static String getFullPathFromUri(Context context,String m_uri)
    {






        String image_path="";
        Uri uri = Uri.parse(m_uri);
        String [] projection = {MediaStore.Images.Media.DATA};
        Cursor cursor = context.getContentResolver().query(uri,projection,null,null,null);
        if (cursor.moveToFirst())
        {
            image_path =cursor.getString(cursor.getColumnIndexOrThrow(projection[0]));
        }
        return image_path;
    }
    public static File getFile(String image_path)
    {
        File file = new File(image_path);
        return file;
    }
}
