//Autor:
 
//Carrega a biblioteca LiquidCrystal
#include <LiquidCrystal.h>

char etec[4] = {'E','T','E','C'};
char itaqua[15] = {'I','T','A','Q','U','A','Q','U','E','C','E','T','U','B','A'};
//Define os pinos que serão utilizados para ligação display
LiquidCrystal lcd(12,11,5,4,3,2);
 
void setup() {
  // put your setup code here, to run once:
  lcd.begin(16,2);
  
  
}
 
void loop(){ 
  
  lcd.setCursor(6,0);
  for (int i = 0; i < 4; i++)
  {
    lcd.print(etec[i]);
    delay(400);
  }
  
    lcd.setCursor(0,1);
  for (int i = 0; i < 15; i++)
  {
    lcd.print(itaqua[i]);
    delay(400);
  }

  //for(int i=0;i<3;i++)
  //{
  //  lcd.setCursor(0,1);
  //  lcd.print("                ");
  //  delay(400);
  //  lcd.print("ITAQUAQUECETUBA");
  //  delay(400);
  //}


  // lcd.setCursor(7,0);
  // lcd.print("T");
  // delay(200);
  // lcd.setCursor(8,0);
  // lcd.print("E");
  // delay(200);
  // lcd.setCursor(9,0);
  // lcd.print("C");
  // delay(200);

  



//Limpa a tela
  //lcd.clear();
//Posiciona o cursor na coluna 6, linha 0;
  //lcd.setCursor(6,0);
//Envia o texto entre aspas para o LCD
  //lcd.print("ETEC");
  //lcd.setCursor(5,1);
  //lcd.print("Itaqua");
  
  




  //Indo pra direita esqeurda
  
  //for (int posicao = 0; posicao < 12; posicao++)
  // {
  //   lcd.scrollDisplayLeft();
  //   delay(300);
    
  // }
  // for (int posicao = 0; posicao < 24; posicao++)
  // {
  //   lcd.scrollDisplayRight();
  //   delay(300);
  // }

}
 

 