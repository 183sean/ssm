function login(){
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    var str = "{username:" + username + ",password:" + password + "}";
    $.ajax({
        url: "/login/check",
        type: "GET",
        data:JSON.parse(str),
        // data: {username:$("#username").val(), content:$("#content").val()},
        dataType: "json",
        success: function(data){
            alert(data);
    }});
}