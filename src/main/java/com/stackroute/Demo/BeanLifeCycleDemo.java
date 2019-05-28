package com.stackroute.Demo;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroying the bean using disposable bean interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing the bean using initializing bean interface");
    }
    public void customInit(){
        System.out.println("initializing the bean using custom init");
    }
    public void customDestroy() {
        System.out.println("Destroying the bean using custom destroy");
    }
}
