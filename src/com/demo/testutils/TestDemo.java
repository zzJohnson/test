package com.demo.testutils;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class TestDemo {

    static String json = "{name:'小明',age:12}";
    static String json2 = "{name:'小明',age:12,score:{mathScore:23,englishScore:34}}";

    @Test
    public void test1() throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");

        Student stu = new Student(name,age);

        System.out.println(stu);
    }

    @Test
    public void test2() {
        System.out.println(json2);
        Gson gson = new Gson();
        Student stu = gson.fromJson(json2,Student.class);

        System.out.println(stu);
    }

    @Test
    public void test3() {
        Student stu = JSON.parseObject(json,Student.class);

        System.out.println(stu);
    }

}
