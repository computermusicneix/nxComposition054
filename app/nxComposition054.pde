// nxComposition054
// Miquel Parera Jaques 
// December.2013
// License: CC-BY-SA

int d = day();    
int m = month();  
int y = year();
int h = hour();
int minut = minute();
int s = second();

float numFrames = 12;

int width = 1440/2; // replace on web
int height = 900/2; // replace on web

float sum = random(1,2000);
int st = int(random(1,20));
int type = int(random(1,2));

int mulA = int(random(1,width));
int mulB = int(random(1,10));
int mulC = int(random(1,10));
int mulD = int(random(1,10));
int mulE = int(random(1,10));
int mulF = int(random(1,width));

void setup() {
  size(width,height);
  frameRate(30);
}

void draw() {
  background(255);
  smooth();
  int i = 0;
  float radius = random(1,100);
  while (i < width) {
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

      mulA = int(random(1,width));
      mulB = int(random(1,10));
      mulC = int(random(1,10));
      mulD = int(random(1,10));
      mulE = int(random(1,10));
      mulF = int(random(1,width));    
  }
//  if (frameCount <= numFrames) {
//  saveFrame("nxComposition054-"+y+"-"+m+"-"+d+"_"+h+"-"+minut+"-"+s+"-##.jpg");  
//  }
}
