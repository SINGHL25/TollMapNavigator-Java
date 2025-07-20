package com.example.tollnavigator.utils;

import android.content.Context;
import android.util.Log;
import com.example.tollnavigator.Site;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtils {

    private static final String FILE_NAME = "sites.json";

    public static List<Site> loadSitesFromJSON(Context context) {
        try {
            InputStream is = context.openFileInput(FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            Gson gson = new Gson();
            Type siteListType = new TypeToken<List<Site>>() {}.getType();
            return gson.fromJson(builder.toString(), siteListType);

        } catch (Exception e) {
            Log.e("JsonUtils", "Error reading sites.json", e);
            return null;
        }
    }

    public static void saveJsonToInternalStorage(Context context, String json) {
        try {
            FileOutputStream fos = context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            fos.write(json.getBytes());
            fos.close();
        } catch (IOException e) {
            Log.e("JsonUtils", "Failed to save JSON", e);
        }
    }
}

