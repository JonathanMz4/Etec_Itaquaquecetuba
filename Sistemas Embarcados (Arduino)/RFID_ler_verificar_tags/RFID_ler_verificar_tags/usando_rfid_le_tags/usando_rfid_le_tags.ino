#include <MFRC522.h>
#include <SPI.h>

#define PINO_RST 9
#define PINO_SDA 10

MFRC522 rfid(PINO_SDA, PINO_RST);

void setup() {
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  Serial.begin(9600);
  SPI.begin();
  rfid.PCD_Init();

  Serial.println("Aproxime a sua tag...");
  Serial.println();
}

void loop() {
  if (!rfid.PICC_IsNewCardPresent() || !rfid.PICC_ReadCardSerial()) {
    return;
  }

  Serial.print("UID da tag : ");
  String conteudo = "";

  for (byte i = 0; i < rfid.uid.size; i++) {
    conteudo.concat(String(rfid.uid.uidByte[i] < 0x10 ? " 0" : " "));
    conteudo.concat(String(rfid.uid.uidByte[i], HEX));
  }

  conteudo.toUpperCase();
  Serial.println(conteudo);

  // Verifica o conteúdo da tag lida
  if (conteudo.substring(1) == "5D CD 89 3F") { //UID 1 - Chaveiro
    Serial.println("Chaveiro");
    tone(8, 900, 500);
  } else if (conteudo.substring(1) == "E3 AA 42 DA") { //UID 2 - Cartão
    Serial.println("Cartão");
    tone(8, 325, 500);
  } else {
    Serial.println("Não registrada");
  }

  
}












