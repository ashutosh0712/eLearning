<%@include file="Header.jsp" %>

<script type="text/javascript" src="../myscripts/TrainerScript.js"></script>

    <body>
        
        <form method="post" action="../TrainerServlet">
                                              
            <table width="400px">
                
                <tr>
                    <td>Old Password</td>
                    <td><input type="password" name="txtOldPassword" id="txtOldPassword" class="form-control" required></td>
                    <td><span id="msg1"></span></td>
                    <%
                        if(request.getParameter("res")!=null)
                        {
                        %>
                    <td >Old Password incorrect!</td>
                <%}%>
                
                </tr>
                <tr>
                    <td>New Password</td>
                    <td><input type="password" name="txtNewPassword" id="txtNewPassword" class="form-control" required></td>
                    <td><span id="msg2"></span></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" name="txtConfirmPassword" id="txtConfirmPassword" class="form-control" required></td>
                    <td><span id="msg3"></span></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnChangePassword" value="Change" onclick= "return changeTrainerPassword()" class="btn btn-primary"></td><br>
                </tr>
            </table>
    
        </form>
 <%@include file="Footer.jsp" %>
