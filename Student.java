package com.Schoolmanagement;

public class Student {
    private String id;
    private String name;
    private int standard;
    private char section;
    private final int totalfee = 100000;
    private int feepaid = 0;
    private int grade;


    public Student(String name, int standard, char section) {
        this.name = name;
        this.standard = standard;
        this.section = section;
    }

    /**
     * Generates a unique ID for every student based on name, the standard they are currently in and the section for example
     * Gowtham studying in 3rd standard C section will have an ID as G3C
     * declared it as set method because different Schools give an id number in different timelines.
     */
    public void setId(){
        this.id = name.charAt(0)+Integer.toString(standard)+section;
    }
    public String getId(){
        return id;
    }

    /**
     * adds the fee to fee paid everytime the user calls for this method until it reaches the total fee
     * @param fee = fee paid by the student
     */
    public void setFeepaid(int fee){
        if(feepaid<totalfee) feepaid+=fee;
        else System.out.println("Student has paid the total fee");
    }

    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }

    public char getSection() {
        return section;
    }

    public int getGrade() {
        return grade;
    }

    public void feestatus(){
        if(feepaid<totalfee) System.out.println("The fee yet to pay is " + (totalfee-feepaid));
        else System.out.println("Full fee paid");
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getFeepaid() {
        return feepaid;
    }
}
