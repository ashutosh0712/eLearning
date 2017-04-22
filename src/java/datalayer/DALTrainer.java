package datalayer;

import beans.Trainer;
import beans.Subject;
import beans.Topic;

import java.sql.*;
import java.util.ArrayList;

public class DALTrainer {

    public void register(beans.Trainer tr) {

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Insert into Trainers(TrainerName,Gender,Country,EMailId,Occupation,WorkingOrganisation,Username,Password,SecurityQuestion,SecurityAnswer,ProfilePic) values(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, tr.getTrainerName());
            ps.setString(2, tr.getGender());
            ps.setString(3, tr.getCountry());
            ps.setString(4, tr.getEMailId());
            ps.setString(5, tr.getOccupation());
            ps.setString(6, tr.getWorkingOrganisation());
            ps.setString(7, tr.getUsername());
            ps.setString(8, tr.getPassword());
            ps.setString(9, tr.getSecurityQuestion());
            ps.setString(10, tr.getSecurityAnswer());
            ps.setString(11, tr.getProfilePicture());

            ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }//catch    

    }//register

    public beans.Trainer authenticate(String pUsername, String pPassword) {

        beans.Trainer tr = new Trainer();

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * from Trainers where Username=? and Password=?");

            ps.setString(1, pUsername);
            ps.setString(2, pPassword);

            ResultSet rs = ps.executeQuery();

            boolean ret = rs.next();

            if (ret == true) {

                tr.setTrainerId(rs.getInt("TrainerId"));
                tr.setTrainerName(rs.getString("TrainerName"));
                tr.setGender(rs.getString("Gender"));
                tr.setCountry(rs.getString("Country"));
                tr.setEMailId(rs.getString("EMailId"));
                tr.setOccupation(rs.getString("Occupation"));
                tr.setWorkingOrganisation(rs.getString("WorkingOrganisation"));
                tr.setUsername(rs.getString("Username"));
                //tr.setPassword(rs.getString("Password"));
                tr.setSecurityQuestion(rs.getString("SecurityQuestion"));
                tr.setSecurityAnswer(rs.getString("SecurityAnswer"));
                //tr.setProfilePicture(rs.getString("ProfilePic"));
            }
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }
        return tr;
    }

    public boolean changePassword(String newPassword, int pTrainerId) {
        boolean ret = false;

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Update Trainers set Password = ? where TrainerId=?");

            ps.setString(1, newPassword);
            ps.setInt(2, pTrainerId);

            ps.executeUpdate();
            ret = true;

        } catch (Exception ex) {
            ret = false;
        }
        return ret;
    }

    public void updateProfile(beans.Trainer tr) {
        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Update Trainers Set TrainerName=?, Gender=?,Country=?,EMailId=?,Occupation=?,WorkingOrganisation=? where TrainerId=?");

            ps.setString(1, tr.getTrainerName());
            ps.setString(2, tr.getGender());
            ps.setString(3, tr.getCountry());
            ps.setString(4, tr.getEMailId());
            ps.setString(5, tr.getOccupation());
            ps.setString(6, tr.getWorkingOrganisation());
            ps.setInt(7, tr.getTrainerId());
//            ps.setString(8, tr.getUsername());
//            ps.setString(9, tr.getPassword());
//            ps.setString(10, tr.getSecurityQuestion);
//            ps.setString(11, tr.getSecurityAnswer);
// we dont set the above 4 values as the norm

            ps.executeUpdate();
            System.out.println("Profile Updated");

        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch

    }//updateProfile

    public beans.Trainer getTrainer(int pTrainerId) {

        beans.Trainer tr = new Trainer();

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * from Trainers Where TrainerId=?");

            ps.setInt(1, pTrainerId);

            ResultSet rs = ps.executeQuery();

            rs.next();

            tr.setTrainerId(rs.getInt("TrainerId"));
            tr.setTrainerName(rs.getString("TrainerName"));
            tr.setGender(rs.getString("Gender"));
            tr.setCountry(rs.getString("Country"));
            tr.setEMailId(rs.getString("EMailId"));
            tr.setOccupation(rs.getString("Occupation"));
            tr.setWorkingOrganisation(rs.getString("WorkingOrganisation"));
            tr.setUsername(rs.getString("Username"));
            tr.setPassword(rs.getString("Password"));
            tr.setSecurityQuestion(rs.getString("SecurityQuestion"));
            tr.setSecurityAnswer(rs.getString("SecurityAnswer"));
            tr.setProfilePicture(rs.getString("ProfilePicture"));
            rs.close();

        }//Try
        catch (Exception ex) {
            System.out.println(ex);
        }

        return tr;
    }

    public beans.Subject addSubject(String pSubjectName, int pTrainerId) {

        boolean ret = false;
        beans.Subject sub = new Subject();
        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Insert into Subjects(SubjectName,TrainerId) values(?,?)");

            ps.setString(1, pSubjectName);
            ps.setInt(2, pTrainerId);

            ps.executeUpdate();
            ret = true;
        }//Try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch

        return sub;
    }

    public ArrayList<beans.Subject> getSubjects(int pTrainerId) {

        ArrayList<beans.Subject> AllSubjects = new ArrayList<>();

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * from Subjects Where TrainerId=?");

            ps.setInt(1, pTrainerId);

            ResultSet rs = ps.executeQuery();

            beans.Subject s;

            while (rs.next()) {

                s = new Subject();

                s.setSubjectId(rs.getInt("SubjectId"));
                s.setSubjectName(rs.getString("SubjectName"));

                AllSubjects.add(s);
            }//while
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        return AllSubjects;
    }//getSubjects

    public boolean addTopic(beans.Topic topic){
    
        boolean ret = false;
        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Insert into Topics(TopicName,SubjectId) values(?,?)");
            
            ps.setString(1, topic.getTopicName());
            ps.setInt(2, topic.SubjectInfo.getSubjectId());
            
            ps.executeUpdate();
            ret = true;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ret;
    }

    public ArrayList<beans.Topic> getTopics(int pTrainerId) {

        ArrayList<beans.Topic> AllTopics = new ArrayList<>();

        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * from Topics where SubjectId IN (Select SubjectId from Subjects where TrainerId=?);");
            //PreparedStatement ps = cn.prepareStatement("Select * from Topics where SubjectId=?");
            
            ps.setInt(1, pTrainerId);

            ResultSet rs = ps.executeQuery();

            beans.Topic t;

            while (rs.next()) {

                t = new Topic();
                
                t.setTopicId(rs.getInt("TopicId"));
                t.setTopicName(rs.getString("TopicName"));

                AllTopics.add(t);
            }//while
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        return AllTopics;
    }//getTopics

    public void deleteSubject( int pSubjectId) {        
        try {
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Delete from Subjects where SubjectId=?");
            
            ps.setInt(1, pSubjectId);
            ps.executeUpdate();

        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
    }//deleteSubject

    public void deleteTopic( int pTopicId){
        try{
            Connection cn = DBOperations.getConnection();
            PreparedStatement ps = cn.prepareStatement("Delete from Topics where TopicId=?");
            
            ps.setInt(1, pTopicId);
            ps.executeUpdate();
            
        }//try
        catch(Exception ex){
            System.out.println(ex);
        }
        
    } //deleteTopic
    
    
}//DALTrainer

