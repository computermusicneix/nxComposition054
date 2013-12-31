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

public class nxComposition054_jpg extends PApplet {

// nxComposition054 jpg
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

int width = 1440; // replace on web
int height = 900; // replace on web

float sum = random(1,2000);
int st = PApplet.parseInt(random(1,20));
int type = PApplet.parseInt(random(1,2));

int mulA = PApplet.parseInt(random(1,width));
int mulB = PApplet.parseInt(random(1,10));
int mulC = PApplet.parseInt(random(1,10));
int mulD = PApplet.parseInt(random(1,10));
int mulE = PApplet.parseInt(random(1,10));
int mulF = PApplet.parseInt(random(1,width));

public void setup() {
  size(width,height);
  frameRate(30);
}

public void draw() {
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
    sum = random(1,2000);
    st = PApplet.parseInt(random(1,20));
    type = PApplet.parseInt(random(1,2));
    mulA = PApplet.parseInt(random(1,width));
    mulB = PApplet.parseInt(random(1,10));
    mulC = PApplet.parseInt(random(1,10));
    mulD = PApplet.parseInt(random(1,10));
    mulE = PApplet.parseInt(random(1,10));
    mulF = PApplet.parseInt(random(1,width));
      saveFrame("nxComposition054-"+y+"-"+m+"-"+d+"_"+h+"-"+minut+"-"+s+"-##.jpg"); 
   if (frameCount == 12) {
     exit();
  }


}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "nxComposition054_jpg" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
