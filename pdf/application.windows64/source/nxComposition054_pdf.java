import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.pdf.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class nxComposition054_pdf extends PApplet {

// nxComposition054 pdf
// Miquel Parera Jaques 
// December.2013
// License: CC-BY-SA



PGraphicsPDF pdf;
PFont font;

int d = day();    
int m = month();  
int y = year();
int h = hour();
int minut = minute();
int s = second();

float numFrames = 12;

int width = 2480; // replace on web
int height = 3508; // replace on web

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
  pdf = (PGraphicsPDF)beginRecord(PDF, "nxComposition053-"+y+"-"+m+"-"+d+"_"+h+"-"+minut+"-"+s+".pdf");
  font = loadFont("Ubuntu-Bold-192.vlw");
  beginRecord(pdf);
}

public void draw() {
  background(255);
 if (frameCount == 1) {
  fill(0,0,0);
  rect(0,(width/2.16f),width,200*4);
  textFont(font, 192);
  smooth();
  fill(255);
  text("nxComposition053",33*4,(width/1.75f));
  text(y+" "+m+" "+d+" "+h+" "+minut+" "+s, 33*4,((width/1.75f)+200));
  text("Miquel Parera", 33*4,((width/1.75f)+400));
 };
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
    pdf.nextPage();
   if (frameCount == 48) {
     exit();
     endRecord();
  }
}

public void mousePressed() {
  endRecord();
  exit();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "nxComposition054_pdf" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
