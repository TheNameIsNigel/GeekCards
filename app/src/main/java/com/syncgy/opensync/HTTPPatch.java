package com.syncgy.opensync;

import org.apache.http.client.methods.*;

public class HTTPPatch extends HttpPost {
    public static final String METHOD_PATCH = "PATCH";

    public HTTPPatch(final String url) {
        super(url);
    }

    @Override
    public String getMethod() {
        return METHOD_PATCH;
    }
}