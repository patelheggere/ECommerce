package com.patelheggere.ecommerce.model;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.patelheggere.ecommerce.contract.MainActivtyContract;
import com.patelheggere.ecommerce.singleton.MySingleton;
import com.patelheggere.ecommerce.utils.AppConstants;

import org.json.JSONObject;

/**
 * Created by Talkative Parents on 1/31/2018.
 */

public class MainActivityModelImpl implements MainActivtyContract.Model {

    @Override
    public void fetchData() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, AppConstants.URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("MainActModelImpl", "onResponse: "+response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("MainActModelImpl", "onErrorResponse: "+error.toString());
            }
        });
        MySingleton.getInstance().addToRequestQueue(jsonObjectRequest);
    }
}
