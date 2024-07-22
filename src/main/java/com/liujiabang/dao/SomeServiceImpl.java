package com.liujiabang.dao;

public class SomeServiceImpl implements SomeService{

    public SomeServiceImpl(){
        super();
        System.out.println("无参构造方法");
    }

    @Override
    public void doSome(){
        System.out.println("=====业务");
    }
}
