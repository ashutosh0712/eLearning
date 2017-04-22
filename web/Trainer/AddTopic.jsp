<%@include file="Header.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@page import="datalayer.DALTrainer"%>
<%@page import="beans.Topic"%>
<%@page import="beans.Subject"%>

<script type="text/javascript" src="myscripts/TrainerScript.js"></script>

<div>

    <form method="post" action="../TrainerServlet">
        <table width="450px">
            <tr>
                <td>Subject</td>
                <td>
                    <select id ="ddlSubjects" name="ddlSubjects" class="form-control">
                        <option>Select Subject</option>
                        <%
                            int tid = Integer.parseInt(request.getSession().getAttribute("LoggedTrainerId").toString());
                            datalayer.DALTrainer objDAL = new DALTrainer();
                            ArrayList<beans.Subject> AL = objDAL.getSubjects(tid);

                            for (beans.Subject s : AL) {%>
                        <option value="<%=s.getSubjectId()%>"><%=s.getSubjectName()%></option>
                        <%}%>
                    </select>
                </td>
            </tr>             

            <tr>
                <td>Topic Name</td>
                <td><input type="text" name="txtTopicName" class="form-control"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="btnAddTopic" value="Add Topic" class="btn btn-primary" ></td>
            </tr>

        </table>

        <table class="table table-striped">
            <tr>
                <th style="width:450px">Subject</th>
                <th></th>
            </tr>

            <%
                ArrayList<beans.Topic> AS = objDAL.getTopics(tid);

                for (beans.Topic t : AS) {
            %>

            <tr>
                <td><%=t.getTopicName()%></td>
                <td> <a href="../TrainerServlet?DTID=<%=t.getTopicId()%>" onclick="return deleteTopicConfirmation('Do you want to delete selected Topic ?')" class="btn btn-danger" >Delete</td>
            </tr>

            <%}%>

        </table>
    </form>
</div>
<%@include file="Footer.jsp" %>
