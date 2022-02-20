import processing.core.PApplet;

public class Rainbow extends PApplet {

  /**
   * Assignment: 5.2 Processing Task 1 - Calling Functions
   * Author: Lydia He
   * Date: Sat Feb 19, 2021
   * Description: Create a simple drawing using processing
   */

  public void settings() {
    // Set size of drawing to 500x500
    size(400, 425);
  }
  
  public void setup() {
    // Initialize setup values that will be consistent throughout the code
    background(0, 0, 0);
  }

  public void draw() {
    // Red arc
    stroke(255, 0, 6);
    fill(255, 0, 6);
    ellipse(200, 200, 275, 275);

    // Orange arc
    stroke(255, 127, 0);
    fill(255, 127, 0);
    ellipse(200, 200, 250, 250);

    // Yellow arc
    stroke(255, 210, 0);
    fill(255, 210, 0);
    ellipse(200, 200, 225, 225);
    
    // Green arc
    stroke(100, 206, 0);
    fill(100, 206, 0);
    ellipse(200, 200, 200, 200);
    
    // Blue arc
    stroke(0, 188, 247);
    fill(0, 188, 247);
    ellipse(200, 200, 175, 175);
    
    // Purple arc
    stroke(102, 102, 255);
    fill(102, 102, 255);
    ellipse(200, 200, 150, 150);

    // Inside of rainbow (black)
    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse(200, 200, 125, 125);

    // Cut off rainbow at 180°
    rect(0, 200, 400, 200);
    
    // Left cloud
    stroke(255);
    fill(255);
    ellipse(65, 200, 60, 60);
    ellipse(100, 200, 54, 54);
    ellipse(125, 200, 48, 48);

    // Right cloud
    ellipse(335, 200, 60, 60);
    ellipse(300, 200, 54, 54);
    ellipse(275, 200, 48, 48);

    // Rain under left cloud
    stroke(0, 188, 247);
    strokeWeight(5);
    line(60, 260, 60, 380);  
    line(95, 240, 95, 360); //line here
    line(120, 240, 120, 380);  

    // Rain under right cloud
    line(340, 240, 340, 380);  
    line(305, 260, 305, 360);
    line(280, 240, 280, 380);  

    // Cut rain into raindrops
    stroke(0, 0, 0);
    strokeWeight(10);
    line(0, 240, 400, 240);
    line(0, 260, 400, 260);
    line(0, 280, 400, 280);
    line(0, 300, 400, 300);
    line(0, 320, 400, 320);
    line(0, 340, 400, 340);
    line(0, 360, 400, 360);
    line(0, 380, 400, 380);

  }
}