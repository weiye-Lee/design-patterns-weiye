package com.study.structured.composite;

public abstract class Entity {
    public abstract String getName();
    // 计算文件|文件夹内存体积大小
    public abstract int getSize();
    public void printList(){
        printList("");
    }
    // 打印出来各个文件
    public abstract void printList(String str);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}