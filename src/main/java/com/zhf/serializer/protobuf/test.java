package com.zhf.serializer.protobuf;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 * mofify:by
 */
public class test {
    public static void main(String[] args) {

      PersonProto.Person person = PersonProto.Person.
              newBuilder().setColor("白色")
              .setNumber(100)
              .setOther("other")
              .setSex("women").build();
        byte[] bytes = person.toByteArray();
        System.out.println("=======bytes:"+bytes+" =====size:"+bytes.length);

        System.out.println("=======person:"+person.toString());

    }

}