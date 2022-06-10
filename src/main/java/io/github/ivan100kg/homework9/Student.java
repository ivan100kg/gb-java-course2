package io.github.ivan100kg.homework9;

@Table(title = "students")
public class Student {
    @Column
    private String name;
    @Column
    private int age;

    private double weight;

    @Column
    private String lord;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
