package com.Schoolmanagement;

public class Teacher {
    private String id;
    private String name;
    private int experience;
    private double salary;
    private String subject;
    private int joiningyear;


    public Teacher(String name, int experience, String subject, double Salary,int joiningyear){
        this.name = name;
        this.experience = experience;
        this.salary = Salary;
        this.subject = subject;
        this.joiningyear = joiningyear;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId() {
        id  = Character.toString(name.charAt(0)) + Character.toString(subject.charAt(0)) + Integer.toString(joiningyear);
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    public double getSalary() {
        return salary;
    }
    public int getJoiningyear(){
        return joiningyear;
    }

}
