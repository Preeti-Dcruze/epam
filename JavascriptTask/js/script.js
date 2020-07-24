function validate()
{
    var username = document.getElementById("username").innerText;
    var password = document.getElementById("password").innerText;

    if(username.length==0 || password.length==0)
    {
           alert("Please Enter All the Details");
           return false;
    }
    alert("successfully Loggedin");
    return true;
}
function validateRegistration()
{
    
    var name = document.getElementById("name").innerText;
    var username = document.getElementById("reg-username").innerText;
    var password = document.getElementById("reg-password").innerText;
    var re_password = document.getElementById("repassword").innerText;
    var email = document.getElementById("email").innerText;
    var phone = document.getElementById("number").innerText;
    if(password.localeCompare(re_password)<0)
    {
        alert("Passwords must match");
        return false;
    }
    else if(name.length==0 || username.length==0 || password.length==0 || re_password.length==0 || email.length==0 || phone.length==0)
    {
        alert("Please Enter all details");
        return false;
    }
    
    
    alert("Successfully Registered");
    return true;
}
