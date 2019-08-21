package com.zhf.serializer;

public interface ISerializer {

    /**
     * 序列化
     * @param object
     * @param <T>
     * @return
     */
    <T> byte[] serializer(T object);

    /**
     *反序列化
     * @param date
     * @param <T>
     * @return
     */
    <T> T deSerializer(byte[] date,Class clazz);

}