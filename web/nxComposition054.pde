// nxComposition054
// Miquel Parera Jaques 
// December.2013
// License: CC-BY-SA

float sum = random(1,2000);
int st = int(random(1,20));
int type = int(random(1,2));

int mulA = int(random(1,720));
int mulB = int(random(1,10));
int mulC = int(random(1,10));
int mulD = int(random(1,10));
int mulE = int(random(1,10));
int mulF = int(random(1,720));

void setup() {
  size(720,450);
  frameRate(12);
}

void draw() {
  background(255);
  smooth();
  int i = 0;
  float radius = random(1,100);
  while (i < 720) {
    radius+= sum;
    float rad = radians(i);
    i = i + 1;
    strokeWeight(random(1,st));
    noFill();
    stroke(0,0,0,random(0,255));
    triangle(rad*mulA, (radius * sin(rad))*mulB, (radius * cos(rad))*mulC, (radius * cos(rad))*mulD, (radius * sin(rad))*mulE, rad*mulF);
    }
   if (mousePressed) {
      sum = random(1,2000);
      st = int(random(1,20));
      type = int(random(1,2));

      mulA = int(random(1,720));
      mulB = int(random(1,10));
      mulC = int(random(1,10));
      mulD = int(random(1,10));
      mulE = int(random(1,10));
      mulF = int(random(1,720));    
  }
}

