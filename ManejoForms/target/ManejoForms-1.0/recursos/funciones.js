function validarForma(data){
    var usuario = data.usuario;
    
    if (usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = form1.password;
    
    if (password.value == "" || password.value.length <4){
        alert("Debe proporcionar al menos 4 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = form1.tecnologia;
    var checkSeleccionado = false;
    
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if (!checkSeleccionado) {
        alert("Seleecione al menos una tecnologia");
        return false;
    }
    
    var generos = form1.genero;
    var radioSeleccionado = false;
    
    for (var i = 0; generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if (!radioSeleccionado) {
        alert("Seleecione un genero");
        return false;
    }
    
    var ocupacion = form1.ocupacion;
    
    if (ocupacion.value == "") {
        alert("Seleccione ocupacion");
        return false;
    }
    
    alert("Formulario completo");
    return true;
}