<%@include file ="Header.jsp" %>

<script type="text/javascript" src="myscripts/TrainerScript.js"></script>

<form method= "post" action="TrainerServlet">
    <table width="450px" class="table table-striped" >
        <tr>
            <td>Trainer Name</td>
            <td><input type="text" name="txtTrainerName" id="txtTrainerName" class="form-control" required></td>
            <td><span id="msg1"></span></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <input type="radio" name="rbtGender" value="Male" checked> Male
                <input type="radio" name="rbtGender" value="Female"> Female
            </td>
            
        </tr>
        <tr>
            <td>User Name</td>
            <td><input type="text" name="txtUserName" id= "txtUserName" class="form-control" required></td>
            <td><span id="msg2"></span></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="txtPassword" id="txtPassword" class="form-control" required></td>
            <td><span id="msg3"></span></td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td><input type="password" name="txtConfirmPassword" id="txtConfirmPassword" class="form-control" required></td>
            <td><span id="msg4"></span></td>
        </tr>
        <tr>
            <td> Security Question:</td>
            <td>
                <select id ="ddlSecurityQuestion" name="ddlSecurityQuestion" >
                    <option>Select Question</option>
                    <option>Where were you born?</option>
                    <option>Which is your favorite Color?</option>
                    <option>Which car do you own?</option>
                    <option>Who's your favorite Actor?</option>
                    <option>What's your dream?</option>
                </select>
                
            </td>
            <td><span id="msg5"></span></td>
        </tr>
        <tr>
            <td>Security Answer</td>
            <td><input type="text" name="txtSecurityAnswer" id="txtSecurityAnswer"></td>
            <td><span id="msg6"></span></td>
        </tr>
        <tr>
            <td>Register</td>
            <td><input type="submit" name="btnRegister" value="Register" class="btn btn-primary" onclick="return validation()"></td>
        </tr>
    </table>
</form>

<%@include file="Footer.jsp" %>