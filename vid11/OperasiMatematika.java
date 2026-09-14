package vid11;

public class OperasiMatematika {
  public static void main(String[] args) {
    // Operator aritmatika, sama saja seperti di js

    int a = 100;
    int b = 10;

    System.out.println(a + b); // addition
    System.out.println(a - b); // substraction
    System.out.println(a * b); // multiplication
    System.out.println(a / b); // distribution
    System.out.println(a % b); // modulo (hitung sisa bagi)


    // Augmented Assignments
    // digunakan untuk mempersingkat penulisan

    int c = 100;

    c = c + 10; // daripada menulis seperti ini lebih baik:

    System.out.println(c); // 110

    c += 10; 

    System.out.println(c); // 120

    // tidak hanya dengan penjumlahan (+) tetapi bisa dilakukan dengan operator lain juga (-, *, /, %)


    // Unary Operator
    // tujuannya sama yaitu untuk mempersingkat penulisan tetapi dengan tujuan yang berbeda:

    int d = +100; // tanda + di depan menandakan bilangan positif
    int e = -10; // tanda - didepan menandakan bilangan negatif

    d++; // ini sama dengan d += 1 atau d = d + 1

    System.out.println(d); // 101 (karna bertambah 1)

    e--; // ini sama dengan e -= 1 atau e = e - 1

    System.out.println(e); // -11 (karna negatif, dan dikurang lagi dengan 1)

    System.out.println(!true); // ! adalah operasi kebalikan

    
  }
  
}
