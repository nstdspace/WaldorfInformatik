public class Aufgabe13 {

  public static void main(String[] args) {
    int a = 15;

    // Versuche zu verstehen, was hier passiert.
    // Was genau tut "else if" ?
    // Was ist anders, wenn wir ganz normal if / else benutzen?
    if(a > 5) {
      System.out.println("banana");
    } else if(a > 10) {
      System.out.println("maracuja");
    } else if(a == 15) {
      System.out.println("pfirsich");
    } else {
      System.out.println("nix fruschte");
    }
  }
}
