package com.example.httpgetjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json {

    public static List<Table> getTable(String response){
        List<Table> tableList = new ArrayList<>();
        try{
            JSONObject jsonObject = new JSONObject(response);
            JSONObject records = jsonObject.getJSONObject("test");
            JSONArray location = records.optJSONArray("test");
            for (int i = 0; i < location.length(); i++) {
                JSONObject object = location.getJSONObject(i);

                String test1 = object.optString("test1");
                String test2 = object.optString("test2");
                JSONObject object_test = object.getJSONObject("test_test");
                String test3 = object_test.optString("test3");

                tableList.add(new Table(test1, test2, test3));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return tableList;
    }
}
