package servlets;

import beans.Trainer;
import beans.Subject;
import beans.Topic;
import datalayer.DALTrainer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if (request.getParameter("DSID") != null) 
        {
            int a = Integer.parseInt(request.getParameter("DSID") );
            datalayer.DALTrainer objDAL = new DALTrainer();
            objDAL.deleteSubject(a);
            
            response.sendRedirect("Trainer/AddSubject.jsp");
        }

          else if (request.getParameter("DTID") != null) 
        {
            int topicid= Integer.parseInt(request.getParameter("DTID") );
            datalayer.DALTrainer objDAL = new DALTrainer();
            objDAL.deleteTopic(topicid);
            
            response.sendRedirect("Trainer/AddTopic.jsp");
        }
        else if (request.getParameter("btnRegister") != null) {

            beans.Trainer trainer = new Trainer();

            trainer.setTrainerName(request.getParameter("txtTrainerName"));
            trainer.setGender(request.getParameter("rbtGender"));
            trainer.setCountry("");
            trainer.setEMailId("");
            trainer.setOccupation("");
            trainer.setWorkingOrganisation("");
            trainer.setUsername(request.getParameter("txtUserName"));
            trainer.setPassword(request.getParameter("txtPassword"));
            trainer.setSecurityQuestion(request.getParameter("ddlSecurityQuestion"));
            trainer.setSecurityAnswer(request.getParameter("txtSecurityAnswer"));
            trainer.setProfilePicture("Def.JPG");

            datalayer.DALTrainer objDAL = new DALTrainer();
            objDAL.register(trainer);

            response.sendRedirect("Login.jsp");
        }//register 
        else if (request.getParameter("btnSignIn") != null) {
            String uid = request.getParameter("txtUserName");
            String pwd = request.getParameter("txtPassword");

            datalayer.DALTrainer objDAL = new DALTrainer();
            beans.Trainer tr = objDAL.authenticate(uid, pwd);

            if (tr.getTrainerId() > 0) {
                request.getSession().setAttribute("LoggedTrainerId", tr.getTrainerId());
                request.getSession().setAttribute("LoggedTrainerName", tr.getTrainerName());

                response.sendRedirect("Trainer/Home.jsp");

            } else {

                response.sendRedirect("Login.jsp?flag=1");

            }
        }//if else
        else if (request.getParameter("btnChangePassword") != null) {

            int tid = Integer.parseInt(request.getSession().getAttribute("LoggedTrainerId").toString());
            String opw = request.getParameter("txtOldPassword");

            datalayer.DALTrainer objDAL = new DALTrainer();
            beans.Trainer trainer = objDAL.getTrainer(tid);

            if (trainer.getPassword().equals(opw)) {
                String npw = request.getParameter("txtNewPassword");
                objDAL.changePassword(npw, tid);
                response.sendRedirect("Trainer/Home.jsp");
            } else {
                response.sendRedirect("Trainer/ChangePassword.jsp?res=-1");
            }

        }//changePassword
        else if (request.getParameter("btnAddSubject") != null) {

            int tid = Integer.parseInt(request.getSession().getAttribute("LoggedTrainerId").toString());

            String subject = request.getParameter("txtAddSubject");
            datalayer.DALTrainer objDAL = new DALTrainer();

            objDAL.addSubject(subject, tid);

            response.sendRedirect("Trainer/AddSubject.jsp");
        }//else If
        
        else if (request.getParameter("btnAddTopic") != null) {
           beans.Topic topic = new Topic();
           topic.setTopicName(request.getParameter("txtTopicName"));
            
            int subjectID = Integer.parseInt(request.getParameter("ddlSubjects"));
            topic.SubjectInfo.setSubjectId(subjectID);
            
            datalayer.DALTrainer objDAL = new DALTrainer();
            objDAL.addTopic(topic);

            response.sendRedirect("Trainer/AddTopic.jsp");
        }//else If
        
        else if (request.getParameter("btnUpdateProfile") != null) {

            int tid = Integer.parseInt(request.getSession().getAttribute("LoggedTrainerId").toString());
            beans.Trainer tr = new Trainer();

            tr.setTrainerId(tid);
            tr.setTrainerName(request.getParameter("txtTrainerName"));
            tr.setGender(request.getParameter("rbtGender"));
            tr.setCountry(request.getParameter("txtCountry"));
            tr.setEMailId(request.getParameter("txtEMailId"));
            tr.setOccupation(request.getParameter("txtOccupation"));
            tr.setWorkingOrganisation(request.getParameter("txtWorkingOrganisation"));

            datalayer.DALTrainer objDAL = new DALTrainer();
            objDAL.updateProfile(tr);
            response.sendRedirect("Trainer/Home.jsp");
        } 
       
       
    }//process request

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
