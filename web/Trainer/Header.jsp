<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.theme.css">

        <script type="text/javascript" src="LatestJQuery.js"></script>

        <style type="text/css">

            table tr td
            {
                padding-top:3px;
                    padding-bottom:3px;
            }
            
            .bg-1{
                background-color:white;
                color:#1abc9c;
            }

            .bg-2{
                background-color:#474e5d; /* Dark Blue #474e5d;*/
                color: #ffffff;			
            }


            .bg-3 { 
                background-color: #ffffff; /* White */
                color: #555555;
            }				

            .container-fluid{
            }

            ul {
                color:white;
            }
            ul li a
            {
                color:white;
            }

            a{
                color: white;
            }
        </style>

    </head>

    <body>

        <div class="container bg-1 " style="padding-top:20px;padding-bottom:20px;">

            <font size="7" face="Avenir" >e-Learning</font>

            <div class="pull-right"> 
                <br>
                <form>
                    <table>
                        <tr>
                            <td>						
                                Welcome ${sessionScope.LoggedTrainerName} &nbsp;&nbsp; | &nbsp; <a href="#" class="btn btn-primary">Logout</a>
                            </td>
                    </table>
                </form>
            </div>

        </div>

        <div class="container-fluid bg-2">
            <div class="container">
                <ul class="nav nav-pills">
                    <li > <a href="Home.jsp">Home</a> </li>
                     <li > <a href="ChangePassword.jsp">Change Password</a> </li> 
                     <li> <a href="AddSubject.jsp">Add Subjects</a> </li>
                    <li> <a href="AddTopic.jsp">Add Topics</a> </li>
                    <li> <a href="Logout.jsp">Logout</a> </li>
                </ul>
            </div>		
        </div>

        <div class="container bg-3" style="padding:20px 0px 20px 20px;">

            <div class="row">

                <div class="col-md-9 col-sm-7" >