package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Assigment;
import model.Trainer;

import newproject.mid;


public class AssigmentDao {
     public void insertStudent(Assigment assigment){
           String insert="insert into trainer values(null,'" + assigment.getName()+ "','" + assigment.getSubDate() + "','"+assigment.getOralMark()+"','"+assigment.getTotalMark()+"')";
            System.out.println(insert);
        try {
            Connection con =mid.getconnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(insert);
            
        } catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        public List<Assigment> getAllAssigments() {
        List<Assigment> result = new ArrayList<>();
        String sql = "SELECT * FROM TRAINER";
        System.out.println(sql);
        Connection con = mid.getconnection();
        try {           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);         
            while (rs.next()) {
                Assigment temp = new Assigment(0,"","",20,100);
                temp.setId(rs.getInt(1));
                temp.setName(rs.getString(2));
                temp.setSubDate(rs.getString(3)); 
                temp.setOralMark(rs.getInt(4));
                temp.setTotalMark(rs.getInt(0));
              
                result.add(temp);
            }        } 
        catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {        }       
        return result;   
}

}