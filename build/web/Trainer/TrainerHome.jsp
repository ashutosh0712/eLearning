<%@include file="Header.jsp" %>

<%

    int TrainerId = Integer.parseInt(session.getAttribute("LoggedTrainerId").toString());
    //String TrainerName = session.getAttribute("LoggedTrainerName").toString();

    datalayer.DALTrainer objDAL = new datalayer.DALTrainer();

    beans.Trainer tr = objDAL.getTrainer(TrainerId);

%>

<form method="post" action="../TrainerServlet">
    <div>
        <table class="table table-striped">
            <tr>
                <td>Trainer Name</td>
                <td><%=tr.getTrainerName()%></td><hr>
            </tr>
            <tr>
                <td>Gender</td>
                <td><%=tr.getGender() != null ? tr.getGender() : ""%></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><%=tr.getCountry() != null ? tr.getCountry() : ""%></td>
            </tr>
            <tr>
                <td>E Mail Id</td>
                <td><%=tr.getEMailId() != null ? tr.getEMailId() : ""%></td>
            </tr>
            <tr>
                <td>Occupation</td>
                <td><%=tr.getOccupation() != null ? tr.getOccupation() : ""%></td>
            </tr>
            <tr>
                <td>Working Organization</td>
                <td><%=tr.getWorkingOrganisation() != null ? tr.getWorkingOrganisation() : ""%></td>
            </tr>

            <td>Profile Pic</td>
            <td><%=tr.getProfilePicture() != null ? tr.getProfilePicture() : ""%></td>

            <tr>
                <td></td>
                <td><a href="EditProfile.jsp" class="btn btn-info">Edit Profile</a></td>
            </tr>
        </table>
    </div>

    <%@include file="Footer.jsp" %>