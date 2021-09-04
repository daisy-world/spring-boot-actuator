package com.app.easy2excel.actuator;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id="my-custom-endpoint")
public class CustomEndpoints {

    Map<String,String> customMap = new HashMap<String,String>();

    @ReadOperation
    public Map customEndpoint(){
        customMap.put("v0.1","spring boot actuator integrated");
        customMap.put("v0.2","spring security integrated");
        customMap.put("v0.3","swagger tool integrated");
        return customMap;
    }

    @ReadOperation
    public String cutsomEndpointWithPathvariable(@Selector String version){

       return  customMap.get(version);
    }

    @WriteOperation
    public Map customEndpoint1(String version,String description){

        customMap.put(version,description);
        return customMap;
    }

    @DeleteOperation
    public void customEndpoint2(@Selector String version){
        customMap.remove(version);
    }

}
