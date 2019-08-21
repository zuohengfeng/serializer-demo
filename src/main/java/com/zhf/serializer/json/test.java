package com.zhf.serializer.json;

import com.zhf.serializer.ISerializer;
import com.zhf.serializer.Person;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 * mofify:by
 */
public class test {
    public static void main(String[] args) {

        Person person = new Person();
        person.setColor("黄色");
        person.setSex("men");
        person.setNumber(1000);
        person.setOther("other");
        ISerializer iSerializer= new JsonSerializer();
        byte[] bytes = iSerializer.serializer(person);
        System.out.println("======"+new String(bytes));
        Person person1 = (Person)iSerializer.deSerializer(bytes, Person.class);
        System.out.println("====="+person1);

    }


}