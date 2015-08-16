package com.syncgy.opensync.api;

import com.syncgy.opensync.APIException;
import com.syncgy.opensync.APIInvoker;
import com.syncgy.opensync.Pair;

import com.syncgy.opensync.model.*;

import java.util.*;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DefaultAPI {
    String basePath = "http://basic-auth-server.herokuapp.com/";
    APIInvoker apiInvoker = APIInvoker.getInstance();

    public void addHeader(String key, String value) {
        getInvoker().addDefaultHeader(key, value);
    }

    public APIInvoker getInvoker() {
        return apiInvoker;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getBasePath() {
        return basePath;
    }


    /**
     *
     *
     * @return void
     */
    public void  rootGet () throws APIException {
        Object postBody = null;


        // create path and map variables
        String path = "/".replaceAll("\\{format\\}","json");

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        // header params
        Map<String, String> headerParams = new HashMap<String, String>();
        // form params
        Map<String, String> formParams = new HashMap<String, String>();





        String[] contentTypes = {

        };
        String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

        if (contentType.startsWith("multipart/form-data")) {
            // file uploading
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();


            HttpEntity httpEntity = builder.build();
            postBody = httpEntity;
        } else {
            // normal form params

        }

        try {
            String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
            if(response != null){
                return ;
            }
            else {
                return ;
            }
        } catch (APIException ex) {
            throw ex;
        }
    }

}
