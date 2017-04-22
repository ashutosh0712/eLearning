function validation()
{
    var ret = true;

    var txt1 = document.getElementById("txtTrainerName");
    var txt2 = document.getElementById("txtUserName");
    var txt3 = document.getElementById("txtPassword");
    var txt4 = document.getElementById("txtConfirmPassword");
    var ddlSecurityQuestion = document.getElementById("ddlSecurityQuestion");
    var txt6 = document.getElementById("txtSecurityAnswer");


    var m1 = document.getElementById("msg1");
    var m2 = document.getElementById("msg2");
    var m3 = document.getElementById("msg3");
    var m4 = document.getElementById("msg4");
    var m5 = document.getElementById("msg5");
    var m6 = document.getElementById("msg6");

    m1.innerHTML = "";
    m2.innerHTML = "";
    m3.innerHTML = "";
    m4.innerHTML = "";
    m5.innerHTML = "";
    m6.innerHTML = "";


    if (txt1.value.length == 0)
    {
        m1.innerHTML = "TrainerName Empty!";
        ret = false;
    }

    if (txt2.value.length == 0)
    {
        m2.innerHTML = "Username Empty!";
        ret = false;
    }

  if (txt3.value.length == 0)
    {
        m3.innerHTML = "Password Empty!";
        ret = false;
    }
    if (txt3.value != txt4.value)
    {
        m3.innerHTML = "Password and Confirm password do not match!";
        ret = false;
    }

    if (ddlSecurityQuestion.selectedIndex == 0)
    {
        m5.innerHTML = "Security Question not Selected!";
        ret = false;
    }
    if (txt6.value.length == 0)
    {
        m6.innerHTML = "Security Answer not set!";
        ret = false;
    }

    return ret;
}

    function changeTrainerPassword() {
    
var ret = true;

    var txt1 = document.getElementById("txtOldPassword");
    var txt2 = document.getElementById("txtNewPassword");
    var txt3 = document.getElementById("txtConfirmPassword");
    
    var m1 = document.getElementById("msg1");
    var m2 = document.getElementById("msg2");
    var m3 = document.getElementById("msg3");
    

    m1.innerHTML = "";
    m2.innerHTML = "";
    m3.innerHTML = "";
    
    
    if (txt1.value.length == 0)
    {
        m1.innerHTML = "Old Password Empty!";
        ret = false;
    }

    if (txt2.value.length == 0)
    {
        m2.innerHTML = "New Password Empty!";
        ret = false;
    }

  if (txt3.value != txt2.value)
    {
        m3.innerHTML = "Confirm Password does not matches!";
        ret = false;
    }
    return ret;
    }

function deleteSubjectConfirmation(msg) {
    var flag = window.confirm(msg);
    return flag;
}

function deleteTopicConfirmation(msg) {
    var flag = window.confirm(msg);
    return flag;
}