package com.androfast.server.appretrofitbasico.negocio;

/**
 * Created by Server on 27/10/2018.
 */


import retrofit2.Call;
import retrofit2.http.GET;


public interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

}