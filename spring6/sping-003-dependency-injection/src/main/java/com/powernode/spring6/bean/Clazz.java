package com.powernode.spring6.bean;

/**
 * @Classname Clazz
 * @Description noting
 * @Date 2023/12/4 18:18
 * @Created by 成熟男涛儿
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
