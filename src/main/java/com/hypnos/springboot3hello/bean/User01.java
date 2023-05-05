package com.hypnos.springboot3hello.bean;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/4-22:06
 */
public class User01 {
    private String name;
    private String description;

    private int age;

    public User01(String name, String description, int age) {
        this.name = name;
        this.description = description;
        this.age = age;
    }

    public User01() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
