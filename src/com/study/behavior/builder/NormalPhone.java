package com.study.behavior.builder;

public class NormalPhone extends Builder{
    @Override
    public void call(String phoneNum) {
        System.out.println(phoneNum + "秒内发出呼叫");
    }

    @Override
    public void sentMsg(String msg) {
        System.out.println("短信内容是" + msg);
    }

    @Override
    public String takePhoto() {
        return "可以拍出一张一般的照片";
    }

    @Override
    public void close() {
        System.out.println("手机关闭");
    }
}
