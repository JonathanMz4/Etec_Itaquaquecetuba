<?php
session_start();

$conn = new mysqli("localhost", "root", "usbw", "loginphp");
if ($conn->connect_error) {
    die("Erro de conexão: " . $conn->connect_error);
}

$usuario = $_POST['usuario'];
$senhaDigitada = md5($_POST['senha']); // aplica md5 como no cadastro

// Busca o usuário
$sql = "SELECT * FROM usuarios WHERE usuario = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("s", $usuario);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    $dados = $result->fetch_assoc();

    // Comparar diretamente os hashes
    if ($senhaDigitada === $dados['senha']) {
        $_SESSION['usuario'] = $dados['usuario'];
        header("Location: painel.php");
        exit;
    } else {
        echo "Senha incorreta! <a href='login.php'>Tentar novamente</a>";
    }
} else {
    echo "Usuário não encontrado! <a href='login.php'>Tentar novamente</a>";
}

$stmt->close();
$conn->close();
?>
