long brilho;

int led1 = 11;
int led2 = 10;
int led3 = 9;
int pot = 0;
int potvalor;

void setup() {
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);

  Serial.begin(9600);
}

void loop() {
  potvalor = analogRead(pot);
  Serial.print("Valor do Potenciometro = ");
  Serial.println(potvalor);
  delay(1);

  brilho = analogRead(pot);

  if(brilho >=0 && brilho <=200){
    digitalWrite(led1, LOW);
    digitalWrite(led2, LOW);
    digitalWrite(led3, LOW);
  }
  if(brilho >=200 && brilho <=350){
    digitalWrite(led1, HIGH);
    digitalWrite(led2, LOW);
    digitalWrite(led3, LOW);
  }
  if(brilho >350 && brilho <=700){
    digitalWrite(led1, HIGH);
    digitalWrite(led2, HIGH);
    digitalWrite(led3, LOW);
  }
  if(brilho >700 && brilho <=1000){
    digitalWrite(led1, HIGH);
    digitalWrite(led2, HIGH);
    digitalWrite(led3, HIGH);
  }
}
