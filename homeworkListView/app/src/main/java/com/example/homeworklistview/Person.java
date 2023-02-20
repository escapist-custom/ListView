package com.example.homeworklistview;

public class Person {
    String name;
    int flag_res; // имя ресурса флага
    String money; // состояние в строковом формате

    public Person(String name, String money, int flag_res) {
        this.flag_res = flag_res;
        this.money = money;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag_res() {
        return flag_res;
    }

    public void setFlag_res(int flag_res) {
        this.flag_res = flag_res;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
