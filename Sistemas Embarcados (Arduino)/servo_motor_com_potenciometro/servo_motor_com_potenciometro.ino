#include <Servo.h>
Servo servo1;
 int val;
 int pos;
void setup() {
 servo1.attach(9);
 servo1.write(0);
}

void loop() {
  val = analogRead(A0);
  pos = map(val, 0, 1023, 0, 180);
  servo1.write(pos);
  delay(15);
}
                                                