package com.zhf.serializer.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.zhf.serializer.ISerializer;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 * mofify:by
 */
public class XmlSerializer implements ISerializer {
    XStream xStream  = new XStream(new DomDriver());


    @Override
    public <T> byte[] serializer(T object) {
        String toxml = xStream.toXML(object);
        System.out.println(toxml);
        return toxml.getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] date, Class clazz) {
        return (T)xStream.fromXML(new String(date));
    }
}