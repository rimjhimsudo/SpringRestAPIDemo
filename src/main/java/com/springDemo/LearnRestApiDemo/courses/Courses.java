package com.springDemo.LearnRestApiDemo.courses;

public class Courses {
    private long id;
    private String name;
    private String department;

    public Courses(long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    //getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }




}
