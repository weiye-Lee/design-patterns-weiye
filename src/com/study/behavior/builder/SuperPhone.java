package com.study.behavior.builder;

public class SuperPhone extends Builder{
    @Override
    public void call(String phoneNum) {
        System.out.println("立即完成呼叫");
    }

    @Override
    public void sentMsg(String msg) {
        System.out.println("彩信内容是" + msg);
    }

    @Override
    public String takePhoto() {
        return "可以拍出一张很好看的照片";
    }

    @Override
    public void close() {
        System.out.println("手机关闭");
    }
}
