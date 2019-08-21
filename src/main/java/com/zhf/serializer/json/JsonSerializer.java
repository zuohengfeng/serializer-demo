package com.zhf.serializer.json;

import com.alibaba.fastjson.JSON;
import com.zhf.serializer.ISerializer;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/8/21
 * mofify:by
 */
public class JsonSerializer implements ISerializer {
    @Override
    public <T> byte[] serializer(T object) {
        String jsonString = JSON.toJSONString(object);
        return jsonString.getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] date, Class clazz) {
        return (T)JSON.parseObject(new String(date), clazz);
    }
}