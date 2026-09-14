package vid20;

public class DoWhileLoop {
  public static void main(String[] args) {
    // Do while loop adalah perulangan yang akan dijalankan MINIMAL 1 kali.
    // setelah satu kali perulangan, baru kemudian mengecek kondisi perulangan.

    int counter = 1;

    do {
      System.out.println(counter);
      counter++;
    } while(counter == 1); // kondisi tidka terpenuhi, karna counter sudah bernilai 2
  }
  
}
