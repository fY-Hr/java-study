package vid10;

public class TipeDataArray {
  public static void main(String[] args) {
    /* 
      Array (atau dalam bahasa indonesia disebut larik)
      - Adalah data yang berisikan kumpulan data dengan tipe data yang sama.
      - Jumlah data di array tidak bisa diubah setelah pertamakali kita buat (berbeda dengan js)
    */

    // Dekalrasi array hanya membutuhkan tambahan [] setelah tipe data yang ditentukan
    String[] arrayString;
    // variabel tersebut sekarang merupakan array of string
    // dan karna Array merupakan tipe data non primitif, jadi bisa di deklarasi saja lebih dulu
    // (tipe data non primitif ini tetap berlaku meskipun tipe data arraynya adalah primitif,
    // karna yang dihitung sebagai non primitif adalah arraynya itu sendiri)

    arrayString = new String[3]; // angka 3 disini menentukan panjang array (array length)
    
    System.out.println(arrayString[0]); // karna belum di inisialisasi apa2, maka defaultnya null

    arrayString[0] = "Muhammad";
    arrayString[1] = "Fakhry";
    arrayString[2] = "Haidar";
    // arrayString[3] = "Holaa"; // Jika ditambahkan lagi melebihi lengthnya maka akan error

    System.out.println(arrayString[0]);
    System.out.println(arrayString[1]);
    System.out.println(arrayString[2]);

    // Ada beberapa cara menginisialiasai array:
    int[] arrayInt = new int[]{
      10, 20, 30, 60, 90
    };

    long[] arrayLong = {
      20, 45, 70, 87, 100
    };

    int[] arrayInt2 = new int[2];
    char[] arrayChar = new char[2];

    System.out.println(arrayInt2[1]); // jika tipe data array bukan non primitif, maka defaultnya 0
    System.out.println(arrayChar[1]); // dan default untuk char adalah ''

    System.out.println(arrayInt[0]);
    System.out.println(arrayLong[4]);
    System.out.println(arrayInt.length);

    // Array di dalam array
    String[][] members = {
      {"Fakhry", "Haidar"},
      {"Eko", "Kurniawan"}
    };

    System.out.println(members[0][0]);
  }  
}
