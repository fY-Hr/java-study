package vid16;

public class SwitchStatement {
  public static void main(String[] args) {
    // Switch statement adalah statement yang digunakan untuk melakukan pemilihan
    // berdasarkan nilai dari sebuah variable yang bersifat case-sensitive

    // Biasanya digunakan ketika value dari variable tersebut sudah diketahui dan tidak berubah-ubah
    char nilai = 'A';

    switch(nilai) {
      case 'A':
        System.out.println("Anda Lulus Dengan Baik");
        break;
      case 'B':
        System.out.println("Anda Remedial");
        break;
      case 'C':
        System.out.println("Anda Tidak Lulus");
        break;
      default:
        System.out.println("Nilai tidak valid");
    }
    

    // lalu ada switch lambda, yang didukung sejak java 14
    // ini lebih mempermudah penulisan karna tidak perlu menulis break untuk setiap case
    switch(nilai) {
      case 'A' -> System.out.println("Anda Lulus Dengan Baik");
      case 'B' -> System.out.println("Anda Remedial");
      case 'C' -> System.out.println("Anda Tidak Lulus");
      default -> {
        System.out.println("Nilai tidak valid");
      }
    }
    // lebih ringkas dan mudah untuk dibaca

    // di java 14 juga ada yield keyword, yang digunakan untuk mengembalikan value dari
    // switch statement
    // untuk menggunakan yield, kita harus menggunakan : dibandingkan dengan -> 
    String result = switch(nilai) {
      case 'A' : yield "Anda Lulus Dengan Baik";
      case 'B' : yield "Anda Remedial";
      case 'C' : yield "Anda Tidak Lulus";
      default : {
        yield "Nilai tidak valid";
      }
    };
    System.out.println(result);
    // walaupun tidak menggunakan yield, keyword : juga bisa digunakan pada switch lambda biasa

    // ya yield ini seperti return pada function biasa, yang mana akan mengembalikan value dari
    // switch statement
  }
  
}
