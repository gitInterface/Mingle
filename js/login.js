let checkbox = document.getElementById("checkbox");
checkbox.onchange = function(){
    let password = document.getElementById("password");
    if (checkbox.checked == true) {
        password.type = "text";
    }else{
        password.type = "password"
    }
}
