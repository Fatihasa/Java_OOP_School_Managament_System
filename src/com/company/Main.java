package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();

       Student Fatih = new Student("Fatih","ASA","male");
       Student Samet = new Student("Samet", "Akkaya","male");
       Student Omer = new Student("Omer","Ozbekler","male");
       Student Melek = new Student("Melek", "Mosso","female");
       Student Hakki = new Student("Hakki","Ak","male");

        studentList.add(Fatih);
        studentList.add(Samet);
        studentList.add(Omer);
        studentList.add(Melek);
        studentList.add(Hakki);

        Teacher Marek = new Teacher("Marek","Nazwisko","male","Math", 2000);
        Teacher Lukash = new Teacher("Lukash","Lewandowskie","male","Physics", 1200);
        Teacher Poulina = new Teacher("Poulina","Sebaskie","female","Chemistry", 1500);

        teacherList.add(Marek);
        teacherList.add(Lukash);
        teacherList.add(Poulina);

        School obj = new School(studentList ,teacherList );

        Fatih.payment(3000);

        System.out.println(obj.getAccount_balance());

    }
}
