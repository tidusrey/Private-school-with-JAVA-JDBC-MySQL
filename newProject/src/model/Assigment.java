/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Μαρια
 */
public class Assigment {
    int id;
    String name;
    String SubDate;
    int oralMark;
    int totalMark;

    public Assigment(int id, String name, String SubDate, int oralMark, int totalMark) {
        this.id = id;
        this.name = name;
        this.SubDate = SubDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
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

    public String getSubDate() {
        return SubDate;
    }

    public void setSubDate(String SubDate) {
        this.SubDate = SubDate;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

}