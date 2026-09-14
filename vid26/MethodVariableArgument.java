package vid26;

public class MethodVariableArgument {
  public static void main (String[] args) {
    // Ketika kita ingin membuat method yang dapat menerima parameter yang jumlahnya tidak tetap
    // Biasanya kita akan menggunakan tipe data array, tapi sejak java 5, java mendukung
    // variable argument, yang memungkinkan kita untuk mengirimkan parameter yang jumlahnya tidak tetap.

    sayCongrats("Fakhry", 80, 85, 90, 95, 100);
  }
  
  public static void sayCongrats(String name, int... values) { // dan disini menggunakan int... untuk menandakan bahwa parameter tersebut bisa menerima parameter yang jumlahnya tidak tetap
    int total = 0;
    for(int value : values) { // Dan values tetap dianggap sebagai array.
      total += value;
    }

    int finalValue = total / values.length;

    if(finalValue >= 75) {
      System.out.println("Selamat " + name + " Anda Lulus");
    } else {
      System.out.println("Maaf " + name + " Anda Tidak Lulus");
    }
  }
}
