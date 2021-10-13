package com.Schoolmanagement;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private int moneyearned = 0;
    private int moneyspent = 0;
    public  School(ArrayList<Teacher> teachers, ArrayList<Student> students){
        this.teachers = teachers;
        this.students = students;
        for (int i = 0; i < teachers.size() ; i++) {
            moneyspent += (teachers.get(i)).getSalary();
        }
        for (int i = 0; i < students.size() ; i++) {
            moneyearned += (students.get(i)).getFeepaid();
        }

    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void updateTeachers(Teacher teacher) {
        teachers.add(teacher);
        moneyspent += teacher.getSalary();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void updateStudents(Student student) {
        students.add(student);
        moneyearned += student.getFeepaid();
    }

    public int getMoneyearned() {
        return moneyearned;
    }

    public int getMoneyspent() {
        return moneyspent;
    }

}
