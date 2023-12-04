package com.powernode.spring6.bean;

import java.util.Date;

/**
 * @Classname SimpleTypeValue
 * @Description 简单类型值
 * @Date 2023/12/4 13:29
 * @Created by 成熟男涛儿
 */
public class SimpleTypeValue {
    private int age;
    private Integer age2;


    private  char c;
    private  Character c2;



    private boolean flag;
    private  Boolean flag2;


    private  Season season;

    private  String username;

    private  Class  classz;

    private Date  birthday;

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setClassz(Class classz) {
        this.classz = classz;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "SimpleTypeValue{" +
                "age=" + age +
                ", age2=" + age2 +
                ",birthday=" + birthday+
                ", c=" + c +
                ", c2=" + c2 +
                ", flag=" + flag +
                ", flag2=" + flag2 +
                ", season=" + season +
                ", username='" + username + '\'' +
                ", classz=" + classz +
                '}';
    }
}
