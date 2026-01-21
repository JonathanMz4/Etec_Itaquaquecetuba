<?php
$mensagem = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nome = htmlspecialchars($_POST["nome"]);
    $email = htmlspecialchars($_POST["email"]);
    $idade = htmlspecialchars($_POST["idade"]);

    if (!empty($nome) && !empty($email) && !empty($idade)) {
        $mensagem = "Olá, $nome! Seu e-mail é $email e você tem $idade anos.";
    } else {
        $mensagem = "Por favor, preencha todos os campos!";
    }
}
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Resultado</h2>
        <div class="mensagem">
            <?php echo $mensagem; ?>
        </div>
        <br>
        <a href="index.html">Voltar</a>
    </div>
</body>
</html>
