<%@include file="Header.jsp" %>
        <%
            int a = Integer.parseInt(session.getAttribute("LoggedTrainerId").toString());
            datalayer.DALTrainer objDAL = new datalayer.DALTrainer();

            beans.Trainer tr = objDAL.getTrainer(a);

        %>

         <form method="post" action="../TrainerServlet">
            <table>
                <tr>
                    <td>Trainer Name</td>
                    <td><input type="text" name="txtTrainerName" value="<%=tr.getTrainerName()%>" ></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="rbtGender" value="Male"  <%=tr.getGender().equals("Male")?"Checked":"" %> > Male
                        <input type="radio" name="rbtGender" value="Female" <%=tr.getGender().equals("Female")?"Checked":""%> > Female
                    </td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td><input type="text" name="txtCountry" value="<%=tr.getCountry()%>"> </td>
                </tr>
                <tr>
                    <td>E Mail Id</td>
                    <td><input type="text" name="txtEMailId" value="<%=tr.getEMailId()%>"> </td>
                </tr>
                <tr>
                    <td>Occupation</td>
                    <td><input type="text" name="txtOccupation" value="<%=tr.getOccupation()%>"> </td>
                </tr>
                <tr>
                    <td>Working Organization</td>
                    <td><input type="text" name="txtWorkingOrganisation" value="<%=tr.getWorkingOrganisation()%>"> </td>
                </tr>
                <tr>
                    <td></td>
                    <td ><input type="submit" name="btnUpdateProfile" value="Update Profile" class="btn btn-primary"> </td>
                </tr>
            </table>
        </form>
    
    <%@include file="Footer.jsp" %>
