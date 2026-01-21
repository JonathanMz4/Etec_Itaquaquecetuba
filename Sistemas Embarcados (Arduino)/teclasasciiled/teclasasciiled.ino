int pinLedVerde = 10;
int pinLedVermelho = 9;
int pinLedAmarelo = 6;
int valorSerial = 0;

void setup() {
  pinMode(pinLedVerde,OUTPUT);
  pinMode(pinLedVermelho,OUTPUT);
  pinMode(pinLedAmarelo,OUTPUT);
  Serial.begin(9600);
}

void loop() {
  if (Serial.available() > 0){
    valorSerial = Serial.read();
    Serial.println(valorSerial);
    if (valorSerial == 76){
      digitalWrite(pinLedVerde,HIGH);
      Serial.println("Ligado");
      delay(50);
      digitalWrite(pinLedVerde,LOW);
    }
    else if (valorSerial == 75){
      digitalWrite(pinLedVermelho,HIGH);
      Serial.println("Ligado");
      delay(50);
      digitalWrite(pinLedVermelho,LOW);
    }
    else if (valorSerial == 77){
      digitalWrite(pinLedAmarelo,HIGH);
      Serial.println("Ligado");
      delay(50);
      digitalWrite(pinLedAmarelo,LOW);
    }
  }
} 

//if (valorSerial == 69){
      //digitalWrite(pinLedVerde,LOW);
      //Serial.println("DESLIGADO");
      //delay(5);