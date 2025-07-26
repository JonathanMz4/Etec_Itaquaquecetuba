#include <Servo.h>
  Servo servo1;
  int i;
void setup() {
  servo1.attach(9);
  servo1.write(0);
}

void loop() {
  for (i= 1; i<=90; i++){
    servo1.write(i);
    delay(15);
  }
  for (i=90; i>=0;i--){
    servo1.write(i);
    delay(15);
  }

}
