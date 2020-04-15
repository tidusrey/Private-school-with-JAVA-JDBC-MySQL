/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Student;

import newproject.mid;


public class StudentDao {
    public static void insertStudent(Student student){
           String insert="insert into Student values(null,'" + student.getName()+ "','" + student.getLastName() + "','"+student.getBirthday()+"',"+student.getFees()+")";
            System.out.println(insert);
        try {
            Connection con =mid.getconnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(insert);
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static List<Student> getAllStudents() {
        List<Student> result = new ArrayList<>();
        String sql = "SELECT * FROM Student";
        System.out.println(sql);
        Connection con = mid.getconnection();
        try {           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);         
            while (rs.next()) {
                Student temp = new Student(0,"","","",2500);
                temp.setId(rs.getInt(1));
                temp.setName(rs.getString(2));
                temp.setLastName(rs.getString(3)); 
                temp.setBirthday(rs.getString(4));
                temp.setFees(rs.getInt(5));
              
                result.add(temp);
            }        } 
        catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {        }       
        return result;   
}
    public static void print(List<Student> ls){
        for(Student i : ls){
            System.out.println(i);
        }
    }
    
}
