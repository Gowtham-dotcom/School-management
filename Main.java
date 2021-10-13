package com.Schoolmanagement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Teacher gowtham = new Teacher("Gowtham",5,"Physics",500,2012);
        Teacher Rajesh = new Teacher("Rajesh",6,"chemistry",800,2010);

        ArrayList<Teacher> teach = new ArrayList<>();
        teach.add(gowtham);
        teach.add(Rajesh);

        Student von = new Student("Von",5,'C');
        Student abhi   = new Student("Abhi",7,'C');

        ArrayList<Student> students = new ArrayList<>();
        students.add(von);
        students.add(abhi);
        abhi.setFeepaid(100000);
        von.setFeepaid(15000);
//        abhi.setFeepaid(1000);
//        abhi.feestatus();
        abhi.setId();
        von.setId();
        System.out.println("abhis ID is "+abhi.getId());
        System.out.println("Vons ID is "+ von.getId());
        School amrita = new School(teach,students);
        System.out.println("Money earned "+ amrita.getMoneyearned());
        System.out.println("Money spent " + amrita.getMoneyspent());
    }
}
