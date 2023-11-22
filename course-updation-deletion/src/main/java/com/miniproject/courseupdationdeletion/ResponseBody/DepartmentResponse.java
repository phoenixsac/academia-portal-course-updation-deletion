package com.miniproject.courseupdationdeletion.ResponseBody;

public class DepartmentResponse {

    private int id;
    private String name;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

//##DEPARTMENTS
//        create table departments(
//        department_id INT PRIMARY KEY,
//        name varchar(30) not null,
//        capacity int not null
//        );
