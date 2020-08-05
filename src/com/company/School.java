package com.company;

import java.util.ArrayList;

public class School {

    String name;
    static int account_balance;
    ArrayList<String> studentList = new ArrayList<>();
    ArrayList<String> teacherList = new ArrayList<>();

    //This is constructor of School class
    public School(String name, ArrayList studentList , ArrayList teacherList){

        account_balance = 0;

        this.name = name;
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public String getName() {
        return name;
    }

    public static int getAccount_balance() {
        return account_balance;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public ArrayList<String> getTeacherList() {
        return teacherList;
    }


    public int howManyStudent(){
        return studentList.size();
    }

    public int howManyTeacher(){
        return teacherList.size();
    }

    public int teacherSalaryPayment(int teacherSalary){
        return account_balance-=teacherSalary;
    }

    //public int teacherAllPayment(int teacher_id , int salary){



        //return;
    //}
}
