/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class mid {
    
    
    private static final String USERNAME="root";
    private static final String PASS ="1988x5";
     private static final String MYSQL= "jdbc:mysql://localhost:3306/privateschool?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
     
     public static Connection getconnection(){
         Connection con =null;
        try {
            
            con=DriverManager.getConnection(MYSQL, USERNAME, PASS);
                    } catch (SQLException ex) {
            Logger.getLogger(mid.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
     }
    
}
