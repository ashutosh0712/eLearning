package datalayer;
import beans.Learner;
import beans.Trainer;

import java.sql.*;
import java.util.ArrayList;

public class DALLearner {

public void register(beans.Learner lr) {
    
     try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Insert into Learners(LearnerName,Gender,Country,EMailId,Occupation,WorkingOrganisation,Username,Password,SecurityQuestion,SecurityAnswer,ProfilePic) values(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, lr.getLearnerName());
            ps.setString(2, lr.getGender());
            ps.setString(3, lr.getCountry());
            ps.setString(4, lr.getEMailId());
            ps.setString(5, lr.getOccupation());
            ps.setString(6, lr.getWorkingOrganisation());
            ps.setString(7, lr.getUsername());
            ps.setString(8, lr.getPassword());
            ps.setString(9, lr.getSecurityQuestion());
            ps.setString(10, lr.getSecurityAnswer());
            ps.setString(11, lr.getProfilePicture());

            ps.executeUpdate();

        }//try
     catch (Exception ex) {
            System.out.println(ex);
        }//catch    

    }//trainer 

public beans.Learner authenticate(String pUsername, String pPassword) {

        beans.Learner lr = new Learner();

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * from Learners where Username=? and Password=?");

            ps.setString(1, pUsername);
            ps.setString(2, pPassword);

            ResultSet rs = ps.executeQuery();

            boolean ret = rs.next();

            if (ret == true) {

                lr.setLearnerId(rs.getInt("LearnerId"));
                lr.setLearnerName(rs.getString("LearnerName"));
                lr.setGender(rs.getString("Gender"));
                lr.setCountry(rs.getString("Country"));
                lr.setEMailId(rs.getString("EMailId"));
                lr.setOccupation(rs.getString("Occupation"));
                lr.setWorkingOrganisation(rs.getString("WorkingOrganisation"));
                lr.setUsername(rs.getString("Username"));
                lr.setPassword(rs.getString("Password"));
                lr.setSecurityQuestion(rs.getString("SecurityQuestion"));
                lr.setSecurityAnswer(rs.getString("SecurityAnswer"));
                //tr.setProfilePicture(rs.getString("ProfilePic"));
            }//if
            
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }
        return lr;
    }


}
