/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import dao.StudentDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import model.Student;
import static newproject.ClassMenu.menu;
import static newproject.mid.getconnection;

public class NewProject {

    public static void main(String[] args) {

//        StudentDao.print(StudentDao.getAllStudents());
        
   menu();
  
    }
    
    }
