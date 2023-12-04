package com.powernode.spring6.bean;

/**
 * @Classname Student
 * @Description noting
 * @Date 2023/12/4 18:18
 * @Created by 成熟男涛儿
 */
public class Student {
    private String name;
    private Clazz clazz;

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
