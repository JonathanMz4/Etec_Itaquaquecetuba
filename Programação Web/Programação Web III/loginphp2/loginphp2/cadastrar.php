<?php
$servername = "localhost";
$username = "root"; 
$password = "usbw"; // ou sua senha do MySQL
$dbname = "loginphp";

// Conectar
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Receber dados
$usuario = $_POST['usuario'];
$senha = md5($_POST['senha']); // substituindo password_hash por md5

// Inserir no banco
$sql = "INSERT INTO usuarios (usuario, senha) VALUES ('$usuario', '$senha')";

if ($conn->query($sql) === TRUE) {
    echo "Usuário cadastrado com sucesso!";
    echo "<br><a href='login.php'>Ir para login</a>";
} else {
    echo "Erro: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
