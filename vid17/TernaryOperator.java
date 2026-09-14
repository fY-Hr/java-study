package vid17;

public class TernaryOperator {
  public static void main(String[] args) {
    int nilai = 80;
    // Ternary Operator adalah operator yang digunakan untuk melakukan pemilihan
    // berdasarkan nilai dari sebuah variable yang bersifat case-sensitive

    // Biasanya digunakan ketika value dari variable tersebut sudah diketahui dan tidak berubah-ubah

    String result = nilai >= 75 ? "Lulus" : "Tidak Lulus";
    System.out.println(result);

    // walaupun ternary operator ini lebih ringkas dan mudah untuk dibaca, tetapi tidak disarankan
    // untuk menggunakan ternary operator pada kondisi yang sangat kompleks, karna justru akan
    // mempersulit pembacaan kode dan debuggingnya
  }
  
}
