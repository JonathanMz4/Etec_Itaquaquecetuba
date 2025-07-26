document.getElementById('check').addEventListener('click', function() {
    var field = document.getElementById('telefone,telefone2,telefonefix,');
    
    // Mostra o valor e em seguida o tipo:
    alert(field.value);
    alert(typeof field.value);
  });