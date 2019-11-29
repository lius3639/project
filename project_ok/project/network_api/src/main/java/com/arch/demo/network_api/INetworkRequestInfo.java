package com.arch.demo.network_api;


import java.util.HashMap;


public interface INetworkRequestInfo {
    HashMap<String, String> getRequestHeaderMap();
    boolean isDebug();
}
