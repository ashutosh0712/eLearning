package servlets;

import beans.Learner;
import datalayer.DALLearner;
import datalayer.DALTrainer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LearnerServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        if (request.getParameter("btnLearnerRegister") != null) {

            beans.Learner learner = new Learner();

            learner.setLearnerName(request.getParameter("txtLearnerName"));
            learner.setGender(request.getParameter("rbtGender"));
            learner.setCountry("");
            learner.setEMailId("");
            learner.setOccupation("");
            learner.setWorkingOrganisation("");
            learner.setUsername(request.getParameter("txtUserName"));
            learner.setPassword(request.getParameter("txtPassword"));
            learner.setSecurityQuestion(request.getParameter("ddlSecurityQuestion"));
            learner.setSecurityAnswer(request.getParameter("txtSecurityAnswer"));
            learner.setProfilePicture("Def.JPG");

            datalayer.DALLearner objDAL = new DALLearner();
            objDAL.register(learner);

            response.sendRedirect("LearnerLogin.jsp");
        }//register 
    
        else if (request.getParameter("btnSignIn") != null) {
            String uid = request.getParameter("txtUserName");
            String pwd = request.getParameter("txtPassword");

            datalayer.DALLearner objDAL = new DALLearner();
            beans.Learner lr = objDAL.authenticate(uid, pwd);

            if (lr.getLearnerId() > 0) {
                request.getSession().setAttribute("LoggedLearnerId", lr.getLearnerId());
                request.getSession().setAttribute("LoggedLearnerName", lr.getLearnerName());

                response.sendRedirect("Learner/LearnerHome.jsp");

            }//if
        }//signin
        
    }//processRequest
    
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
