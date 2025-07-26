
void setup() {
  pinMode (8,OUTPUT);
  pinMode (9,OUTPUT);
  pinMode (12,OUTPUT);
  pinMode (10, OUTPUT);
  pinMode (11, OUTPUT);
}

void loop() {
// Vermelho carro 
 digitalWrite(9, HIGH);
// Verde pedestre
 digitalWrite(10, HIGH);
 delay(4000);
 digitalWrite(9, LOW);
 digitalWrite(10, LOW);


  // Verde carro 
 digitalWrite(12, HIGH);
 // Vermelho pedestre
 digitalWrite(11, HIGH);
 delay(3000);
 digitalWrite(12, LOW);


 // Amarelo
 digitalWrite(8, HIGH);
 delay(2000);
 digitalWrite(8, LOW);
 digitalWrite(11, LOW);
}
