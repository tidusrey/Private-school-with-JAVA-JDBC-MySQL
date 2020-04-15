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
  import model.Trainer;
import newproject.mid;

/**
 *
 * @author Μαρια
 */
public class TrainerDao {

    
    public void insertTrainer(Trainer trainer){
           String insert="insert into trainer values(null,'" + trainer.getFirstName()+ "','" + trainer.getLastName() + "','"+trainer.getSubject()+"')";
            System.out.println(insert);
        try {
            Connection con =mid.getconnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(insert);
            
        } catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        public List<Trainer> getAllTrainers() {
        List<Trainer> result = new ArrayList<>();
        String sql = "SELECT * FROM TRAINER";
        System.out.println(sql);
        Connection con = mid.getconnection();
        try {           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);         
            while (rs.next()) {
                Trainer temp = new Trainer();
                temp.setId(rs.getInt(1));
                temp.setFirstName(rs.getString(2));
                temp.setLastName(rs.getString(3)); 
                temp.setSubject(rs.getString(4));
              
                result.add(temp);
            }        } 
        catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {        }       
        return result;    
        }
}

