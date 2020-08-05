package com.company;

public class Teacher extends Person {

    String branch;
    int teacher_id = 100;
    int teacherSalary;


    public Teacher(String name, String surname, String gender ,String branch, int salary){
        super(name, surname, gender);
        this.teacher_id += 1;
        this.teacherSalary = salary;
        this.branch = branch;

    }

    public String getBranch() {
        return branch;
    }

    public int getTeacherSalary() {
        return this.teacherSalary;
    }


}
