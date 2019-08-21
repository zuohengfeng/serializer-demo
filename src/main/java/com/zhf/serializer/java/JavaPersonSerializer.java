package com.zhf.serializer.java;

import com.zhf.serializer.ISerializer;

import java.io.*;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 * mofify:by
 */
public class JavaPersonSerializer implements ISerializer {

    @Override
    public <T> byte[] serializer(T object) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream ous = null;
        try {
            ous = new ObjectOutputStream(new FileOutputStream(new File("person")));
            ous.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public <T> T deSerializer(byte[] date, Class clazz) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(new File("person")));
            return (T) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }


}