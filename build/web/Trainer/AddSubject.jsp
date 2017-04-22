<%@include file="Header.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@page import="datalayer.DALTrainer"%>
<%@page import="beans.Subject"%>

<script type="text/javascript" src="../myscripts/TrainerScript.js"></script>

<div >

    <form method="post" action="../TrainerServlet">
        <table >
            <tr>
                <td>Subject</td>
                <td><input type="text" name="txtAddSubject" class="form-control" required></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="btnAddSubject" value="Add Subject" class="btn btn-primary" ></td>
            </tr>
        </table>
    </form>

        <table class="table table-striped table-hover">
            <tr>
                <th style="width:450px">Subject</th>
                <th></th>
            </tr>

    
            <%
                int tid = Integer.parseInt(request.getSession().getAttribute("LoggedTrainerId").toString());
                datalayer.DALTrainer objDAL = new DALTrainer();
                ArrayList<beans.Subject> AS = objDAL.getSubjects(tid);
                if (AS.size() > 0) {
            %>

                <%
                    for (beans.Subject s : AS) {
                %>

                <tr>
                    <td><%=s.getSubjectName()%></td>
                    <td> <a href="../TrainerServlet?DSID=<%=s.getSubjectId()%>" onclick="return deleteSubjectConfirmation('Do you want to delete selected Subject?')" class="btn btn-danger">Delete</td>
                </tr>

                <%}%>

            <%}
            else
            {   %>
            
            <tr>
                <td colspan="2">There is no subject</td>
            </tr>
            
            <%}%>

            </table>
</div>
<%@include file="Footer.jsp" %>