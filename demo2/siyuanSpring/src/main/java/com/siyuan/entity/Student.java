package com.siyuan.entity;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Classes classes;
    private Cars car;

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }


    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                ", car=" + car +
                '}';
    }

    public Student() {
        System.out.println("创建class对象");
    }
    public Student(int id,String name,int age){
        this.age=age;
        this.name=name;
        this.id=id;
        System.out.println("use para constructor!");
    }
}
