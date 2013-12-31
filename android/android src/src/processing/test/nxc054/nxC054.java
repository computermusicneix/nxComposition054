package processing.test.nxc054;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class nxC054 extends PApplet {

// nxComposition054_android
// Miquel Parera Jaques 
// December.2013
// License: CC-BY-SA

float sum = random(1,2000);
int st = PApplet.parseInt(random(1,20));
int type = PApplet.parseInt(random(1,2));

int mulA = PApplet.parseInt(random(1,1240));
int mulB = PApplet.parseInt(random(1,10));
int mulC = PApplet.parseInt(random(1,10));
int mulD = PApplet.parseInt(random(1,10));
int mulE = PApplet.parseInt(random(1,10));
int mulF = PApplet.parseInt(random(1,1240));

public void setup() {
 
  frameRate(30);
}

public void draw() {
  background(255);
  smooth();
  int i = 0;
  float radius = random(1,100);
  while (i < 1240) {
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
      st = PApplet.parseInt(random(1,20));
      type = PApplet.parseInt(random(1,2));

      mulA = PApplet.parseInt(random(1,1240));
      mulB = PApplet.parseInt(random(1,10));
      mulC = PApplet.parseInt(random(1,10));
      mulD = PApplet.parseInt(random(1,10));
      mulE = PApplet.parseInt(random(1,10));
      mulF = PApplet.parseInt(random(1,1240));    
  }
}

  public int sketchWidth() { return 620; }
  public int sketchHeight() { return 877; }
}
