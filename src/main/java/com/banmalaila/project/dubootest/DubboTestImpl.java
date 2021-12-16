package com.banmalaila.project.dubootest;

import org.apache.dubbo.config.annotation.DubboService;

import com.banmalaila.project.dubootest.ifc.DubboTestIfc;

@DubboService
public class DubboTestImpl implements DubboTestIfc {

    @Override
    public String test() {
        return "hello";
    }
}
