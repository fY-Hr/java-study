package vid28;

public class RecursiveMethod {
  public static void main(String[] args) {
    // Recursive Method adalah method yang memanggil dirinya sendiri.
    // Recursive Method biasanya digunakan untuk menyelesaikan masalah yang kompleks.
    // Namun perlu diingat, recursive method harus memiliki kondisi berhenti, jika tidak maka method tersebut akan terus memanggil dirinya sendiri dan menghabiskan memory.

    System.out.println(factorialLoop(5));
    System.out.println(factorialRecursive(5));
    // loop(100000); //uncomment untuk melihat stack overflow.
  }
  // contoh looping:
  public static int factorialLoop(int value) {
    int result = 1;
    for(int i = 1; i <= value; i++) {
      result *= i;
    }
    return result;
  }
  // contoh recursive:
  public static int factorialRecursive(int value) {
    if(value == 1) {
      return 1;
    } else {
      return value * factorialRecursive(value - 1);
      // visualisasi:
      // 5 * factorialRecursive(4)
      // 5 * 4 * factorialRecursive(3)
      // 5 * 4 * 3 * factorialRecursive(2)
      // 5 * 4 * 3 * 2 * factorialRecursive(1)
      // 5 * 4 * 3 * 2 * 1
      // 120
    }
  }

  // dalam beberapa kasus, recursive method lebih mudah digunakan dibanding looping.
  // namun perlu diingat, recursive method memakan memory lebih banyak dibanding looping.
  // dan recursive method lebih sulit untuk dibaca dan di debug dibanding looping.

  // Jika kita menggunakan recursive method terlalu dalam, maka akan terjadi stack overflow.
  // ketika kita memanggil method, java akan menyimpannya dalam stack memory. Dan jika dipanggil
  // terus menerus, stack akan menumpuk dan jika terlalu dalam akan terlalu besar sehingga 
  // menyebabkan stack overflow.

  // contoh stack overflow:
  public static void loop(int value) {
    if(value == 0) {
      System.out.println("Selesai");
    } else {
      System.out.println("Loop " + value);
      loop(value - 1);
    }
  }
}
