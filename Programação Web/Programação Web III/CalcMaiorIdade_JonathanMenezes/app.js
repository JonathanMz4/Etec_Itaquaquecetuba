function verificarIdade(){
    let dataNascimento = document.getElementById("dataNascimento").value;

    if (!dataNascimento){
        document.getElementById("resultado").innerHTML = "Por favor, selecione uma data.";
        return;
    }

    let hoje = new Date();
    let nascimento = new Date(dataNascimento);

    let idade = hoje.getFullYear() - nascimento.getFullYear();
    let mes = hoje.getMonth() - nascimento.getMonth();

    if (mes < 0 || (mes === 0 && hoje.getDate() < nascimento.getDate())){
        idade--;
    }

    if (idade < 18){
        document.getElementById("resultado").innerText = "Você tem " + idade + " anos. É menor de idade.";
    }
    else {
        document.getElementById("resultado").innerText = "Você tem " + idade + " anos. É maior de idade.";
    }
}