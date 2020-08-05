package com.company;

import java.util.ArrayList;

public class School {


    static int account_balance;
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;


    //This is constructor of School class
    public School(ArrayList<Student> studentList , ArrayList<Teacher> teacherList){

        account_balance = 0;

        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Teacher> getTeacherList() {
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
