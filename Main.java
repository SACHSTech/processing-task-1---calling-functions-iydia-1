import processing.core.PApplet;

/**
 * Main class to execute the sketch
 * @author Lydia He
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Rainbow mySketch = new Rainbow();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}