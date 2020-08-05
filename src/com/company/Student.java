package com.company;

public class Student implements Person{

    int student_id;
    String name;
    String surname;
    String gender;
    static int initial_student_id = 200;
    static int tuitionfee = 2000;
    static int tuitionfee_paid;

    public void person(int student_id, String name , String surname , String gender ){

        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.student_id = initial_student_id + 1;
    }


    // When student made a payment. This method will update tuitionfee_paid.
    public void payment(int student_paid){

        tuitionfee_paid += student_paid;
    }

    // This method will show the student how much money must pay for the tuition fee.
    public int willPay(){

        return tuitionfee-tuitionfee_paid;
    }

    // This is a getter for student who want to learn how much the student paid for tuition fee yet
    public static int getTuitionfee_paid() {

        return tuitionfee_paid;
    }
}
