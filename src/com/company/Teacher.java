package com.company;



public class Teacher implements Person{

    String name;
    String surname;
    String gender;
    String branch;
    int teacher_id;
    int teacherSalary;


    public void person(int teacher_id ,String name, String surname, String gender){

        this.teacher_id = teacher_id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }

    public String getBranch() {
        return branch;
    }

    public int getTeacherSalary() {
        return this.teacherSalary;
    }


}
