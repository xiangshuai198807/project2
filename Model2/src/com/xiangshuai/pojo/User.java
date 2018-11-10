package com.xiangshuai.pojo;

/**
 * @author 刘期香
 * @create 2018-11-04 19:58
 */
public class User {
    private String username;
    private String age;
    private String id;

    public User() {
    }

    public User(String username, String age, String id) {
        this.username = username;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


