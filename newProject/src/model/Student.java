/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import newproject.NewProject;

/**
 *
 * @author Μαρια
 */
public class Student extends NewProject {
    int id;
    String name;
    String lastName;
    String birthday;
    int fees;

    public Student(int id, String name, String lastName, String birthday, int fees) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.fees = fees;
    }

    public Student(String name, String lastName, String birthday, int fees) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.fees = fees;
    }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthday=" + birthday + ", fees=" + fees + '}';
    }
    
}