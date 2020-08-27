function createUser(){
    $("#formRegister").submit(function(event){
        	event.preventDefault(); //prevent default action
        	var request_method = $(this).attr("method"); //get form GET/POST method
            var registerRequest={
                firstName:$('#inputFirstName').val(),
                lastName:$('#inputLastName').val(),
                email:$('#inputEmail').val(),
                mobileNumber:$('#inputMobileNumber').val(),
                agencyName:$('#inputAgencyName').val(),
                agencyDetail:$('#inputAgencyDetail').val(),
                password:$('#inputPassword').val(),
                repeatPassword:$('#inputRepeatPassword').val()
            }
            if(registerRequest.password!=registerRequest.repeatPassword){
                alert("Passwords Didn't Match!!");
            }else{
                $.ajax({
                 url :  "/api/createNewAccount",
                 type: request_method,
                 dataType: 'json',
                 contentType: 'application/json',
                 data: JSON.stringify(registerRequest),
                 success: function(data) {
                        alert("Account Berhasil Dibuat");
                        window.location.href = 'http://localhost:8080/login';
                     },
                        error: function(data) {
                     },
                 });
            }
        });
}

$(document).ready( function () {
    createUser()
})