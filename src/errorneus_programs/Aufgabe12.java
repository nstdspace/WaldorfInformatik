public class Aufgabe12 {

  public static void main(String[] args) {
    int a = 4;
    double b = -3.6;
    int c = 8;
    boolean z = a > b;

    // Versuche zu verstehen, was hier passiert. If-Statements lassen sich verschachteln...
    // Experimentiere mit den Werten der oben deklarierten Variablen - kannst du das Programm zu jeder möglichen Ausgabe zwingen?
    if(z) {
      if(b < c) {
        if(c * b > 4) {
          System.out.println("hierhin?");
        } else {
          System.out.println("ahaaaa...");
        }
      } else {
        System.out.println("oder hierhin?");
      }
    } else {
      System.out.println("hierhin vielleicht?");
    }
  }
}
