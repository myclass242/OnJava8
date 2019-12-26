package com.zy.basic;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Service1 implements Service {
    Service1() {}

    @Override
    public void method1() {
        System.out.println("Service1.method1()");
    }
    @Override
    public void method2() {
        System.out.println("Service1.method2()");
    }
}

class Service1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Service1();
    }
}

class Service2 implements Service {
    Service2() {}

    @Override
    public void method1() {
        System.out.println("Service2.method1()");
    }
    @Override
    public void method2() {
        System.out.println("Service2.method2()");
    }
}

class Service2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Service2();
    }
}

public class Factory {
    static void serviceComsumer(ServiceFactory serviceFactory) {
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceComsumer(new Service1Factory());
        serviceComsumer(new Service2Factory());
    }
}
