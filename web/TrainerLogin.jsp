<%@include file ="Header.jsp" %>

<form method="post" action="TrainerServlet" class="minimal">

  <table width="300">
        <tr>
            <td>Username</td>
            <td><input type="text" name="txtUserName" class="form-control"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="Password" name="txtPassword" class = "form-control"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="btnSignIn" value="Sign In " class="btn btn-primary" ></td>
        </tr>

        <%
            if (request.getParameter("flag") != null) {
        %>

        <tr>
            <td></td>
            <td>User Id or password incorrect!</td>
        </tr>

        <%}%>

    </table>

</form>
<%@include file ="Footer.jsp" %>