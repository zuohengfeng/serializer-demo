package com.zhf.serializer;

import java.io.Serializable;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 */
public class Person implements Serializable {
    private String sex;
    private String color;
    private Integer number;

    //transient 该关键字修饰变量不会序列化
    private transient String other;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                ", other='" + other + '\'' +
                '}';
    }
}