<?php
session_start();

$conn = new mysqli("localhost", "root", "usbw", "loginphp");
if ($conn->connect_error) {
    die("Erro de conexão: " . $conn->connect_error);
}

$usuario = $_POST['usuario'];
$senha = $_POST['senha']; 

$sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("ss", $usuario, $senha);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    $usuario = $result->fetch_assoc();
    $_SESSION['usuario'] = $usuario['usuario'];
    header("Location: painel.php");
    exit;
} else {
    echo "Usuário ou senha incorretos! <a href='login.php'>Tentar novamente</a>";
}
?>
