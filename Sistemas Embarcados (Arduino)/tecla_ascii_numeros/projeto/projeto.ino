// Pinos conectados aos segmentos do display
// Ordem: a, b, c, d, e, f, g, dp
int segmentos[8] = {2, 3, 4, 5, 6, 7, 8, 9};

void setup() {
  for (int i = 0; i < 8; i++) {
    pinMode(segmentos[i], OUTPUT);
  }
  Serial.begin(9600);
  Serial.println("Digite um numero (0-9) ou letra (A-F):");
}

void mostrarCaractere(int ascii) {
  // Ordem: a b c d e f g dp
  byte tabela[16][8] = {
    {1,1,1,1,1,1,0,0}, // 0
    {0,1,1,0,0,0,0,0}, // 1
    {1,1,0,1,1,0,1,0}, // 2
    {1,1,1,1,0,0,1,0}, // 3
    {0,1,1,0,0,1,1,0}, // 4
    {1,0,1,1,0,1,1,0}, // 5
    {1,0,1,1,1,1,1,0}, // 6
    {1,1,1,0,0,0,0,0}, // 7
    {1,1,1,1,1,1,1,0}, // 8
    {1,1,1,1,0,1,1,0}, // 9
    {1,1,1,0,1,1,1,0}, // A
    {0,0,1,1,1,1,1,0}, // b
    {1,0,0,1,1,1,0,0}, // C
    {0,1,1,1,1,0,1,0}, // d
    {1,0,0,1,1,1,1,0}, // E
    {1,0,0,0,1,1,1,0}  // F
  };

  int indice = -1;

  // Verifica pelo código ASCII
  if (ascii >= 48 && ascii <= 57) {       // '0' a '9'
    indice = ascii - 48;
  } else if (ascii >= 65 && ascii <= 70) { // 'A' a 'F'
    indice = 10 + (ascii - 65);
  } else if (ascii >= 97 && ascii <= 102) { // 'a' a 'f'
    indice = 10 + (ascii - 97);
  }

  if (indice != -1) {
    for (int i = 0; i < 8; i++) {
      digitalWrite(segmentos[i], tabela[indice][i]);
    }
  } else {
    Serial.print("ASCII nao reconhecido: ");
    Serial.println(ascii);
  }
}

void loop() {
  if (Serial.available() > 0) {
    int ascii = Serial.read(); // lê o código ASCII
    mostrarCaractere(ascii);
  }
}
