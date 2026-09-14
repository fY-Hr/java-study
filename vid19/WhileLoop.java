package vid19;

public class WhileLoop {
  public static void main(String[] args) {
    // While loop juga merupakan perulangan namun berbeda dengan for loop
    // while loop hanya memiliki kondisi perulangan saja, tidak ada init dan post statement

    int counter = 1;

    while(counter <= 10) {
      System.out.println(counter);
      counter++; // perhatikan bagian ini, jika tidak ada maka perulangan tidak akan berhenti
    }
  }
  
}
