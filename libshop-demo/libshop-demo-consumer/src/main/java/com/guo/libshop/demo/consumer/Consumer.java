package com.guo.libshop.demo.consumer;

import com.guo.libshop.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String []args) throws Exception{
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
    DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        while (true) {
        try {
            Thread.sleep(1000);
            String hello = demoService.sayHello("world"); // call remote method
            System.out.println(hello); // get result

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

}
}
