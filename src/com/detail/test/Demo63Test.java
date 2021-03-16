package com.detail.test;

public class Demo63Test implements test63{

    @Override
    public void doclone() {
        // cloneable 接口中不含有clone方法，方法在object类中
        // 因为时super
    }


}
interface test63{
    public void doclone();
}