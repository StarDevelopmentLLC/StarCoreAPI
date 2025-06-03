package com.stardevllc.starcore.api.wrappers.com.stardevllc.starcore.api;

import com.stardevllc.starcore.api.wrappers.MCWrappers;

public abstract class StarCoreAPI {
    private static StarCoreAPI apiInstance;
    
    public static void setAPI(StarCoreAPI api) {
        apiInstance = api;
    }
    
    public static StarCoreAPI getAPI() {
        return apiInstance;
    }
    
    public abstract MCWrappers getWrappers();
}
