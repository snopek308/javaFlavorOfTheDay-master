function init() {
    $('#submit').click(getEmail)
}

init();

var firstName;
var lastName;
var email;

function getEmail(){
    firstName = document.getElementById("fname").value;
    console.log(firstName)
}
