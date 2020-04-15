
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
import model.Trainer;

import newproject.mid;


public class CourseDao {
     public void insertStudent(Course course){
           String insert="insert into trainer values(null,'" + course.getSemester()+ "','" + course.getStream() + "','"+course.getType()+"','"+course.getStartDate()+"','"+ course.getEndDate()+"')";
            System.out.println(insert);
        try {
            Connection con =mid.getconnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(insert);
            
        } catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        public List<Course> getAllTrainers() {
        List<Course> result = new ArrayList<>();
        String sql = "SELECT * FROM TRAINER";
        System.out.println(sql);
        Connection con = mid.getconnection();
        try {           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);         
            while (rs.next()) {
                Course temp = new Course(0,"","","","","");
                temp.setId(rs.getInt(1));
                temp.setSemester(rs.getString(2));
                temp.setStream(rs.getString(3)); 
                temp.setType(rs.getString(4));
                temp.setStartDate(rs.getString(5));
                temp.setEndDate(rs.getString(6));
              
                result.add(temp);
            }        } 
        catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {        }       
        return result;   
}

}