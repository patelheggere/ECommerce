package com.patelheggere.ecommerce.model;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.patelheggere.ecommerce.contract.MainActivtyContract;
import com.patelheggere.ecommerce.datamodel.Categories;
import com.patelheggere.ecommerce.datamodel.RankingProducts;
import com.patelheggere.ecommerce.datamodel.Rankings;
import com.patelheggere.ecommerce.datamodel.ResultModel;
import com.patelheggere.ecommerce.singleton.MySingleton;
import com.patelheggere.ecommerce.utils.AppConstants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class MainActivityModelImpl implements MainActivtyContract.Model {

    private ResultModel resultModel;
    @Override
    public ResultModel fetchData() {
        final Gson mGson = new Gson();
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, AppConstants.BASE_URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                 resultModel = mGson.fromJson(response.toString(), ResultModel.class);
                if(resultModel!=null)
                    Log.d("MainActModelImpl", "onResponse: "+resultModel.getCategories().get(0).getProducts().get(0).getVariants().get(0).getColor());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("MainActModelImpl", "onErrorResponse: "+error.toString());
            }
        });
        MySingleton.getInstance().addToRequestQueue(jsonObjectRequest);
        return resultModel;
    }
}
