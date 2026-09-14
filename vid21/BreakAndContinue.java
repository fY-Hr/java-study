package vid21;

public class BreakAndContinue {

  public static void main(String[] args) {
    // Break and Continue adalah statement yang digunakan untuk menghentikan atau melanjutkan perulangan
    // Break digunakan untuk menghentikan perulangan secara paksa
    // Continue digunakan untuk melanjutkan perulangan ke iterasi berikutnya

    int counter = 1;
    while(counter <= 10) {
      System.out.println(counter);
      if(counter == 5) {
        break;
      }
      counter++;
    }

    for(int i = 1; i <= 100; i++) {
      if(i % 2 == 0) {
        continue;
      }
      System.out.println("Perulangan ganjil: " + i);
    }
  }
}
