package lab6.games;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class ExampleTiledLayer extends MIDlet {
  private Display display;
  
  public void startApp() {
    try {
      display = Display.getDisplay(this);
      ExampleTiledLayerCanvas gameCanvas = new ExampleTiledLayerCanvas();
      gameCanvas.start();
      display.setCurrent(gameCanvas);
    } catch (Exception ex) {
      System.out.println(ex);
    }  
  }
  
  public Display getDisplay() {
    return display;  
  }
  
  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
    exit();
  }  
  
  public void exit() {
    System.gc();
    destroyApp(false);
    notifyDestroyed();
  }
}