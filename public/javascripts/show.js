/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('button.save').click(function(e){
    e.preventDefault();
    Swal.fire(
        'All saved!',
        'Professor ${teacher.name} ${teacher.lastName} saved with id ${teacher.employeeNumber}',
        'success'
    )
});


