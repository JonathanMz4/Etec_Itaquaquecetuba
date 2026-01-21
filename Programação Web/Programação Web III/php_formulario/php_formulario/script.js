function validarFormulario() {
    let nome = document.getElementById("nome").value.trim();
    let email = document.getElementById("email").value.trim();
    let idade = document.getElementById("idade").value.trim();

    if (nome === "" || email === "" || idade === "") {
        alert("Todos os campos são obrigatórios!");
        return false;
    }
    return true;
}
