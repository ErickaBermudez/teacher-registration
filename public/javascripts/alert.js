/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function alertSuccess() {
    $(".alertSuccess").show();
    setTimeout(function() {
        $(".alertSuccess").hide();
    }, 2000);
    $("#register").submit();
}


 var cityID = document.getElementById("setCity").value;
 if (cityID !== ''){
 document.getElementById('city').value = parseInt(cityID);
 }else{
 document.getElementById('city').value = 1;
 }





