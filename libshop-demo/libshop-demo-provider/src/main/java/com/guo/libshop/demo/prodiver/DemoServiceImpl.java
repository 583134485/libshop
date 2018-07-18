package com.guo.libshop.demo.prodiver;

import com.guo.libshop.demo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        StringBuilder message=new StringBuilder("[");
        message.append(new SimpleDateFormat("HH:mm:ss").format(new Date()))
                .append("] Hello ")
                .append(name)
                .append(",request from consumer");
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " );
        return message.toString();
    }
}
