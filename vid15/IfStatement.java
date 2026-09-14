package vid15;

public class IfStatement {
  public static void main(String[] args) {
    int nilai = 80;
    int absen = 90;

    if(nilai >= 75 && absen >= 75) {
      System.out.println("Selamat Anda Lulus");
    } else if(nilai >= 60 && absen >= 60) {
      System.out.println("Anda Remedial");
    } else {
      System.out.println("Anda Tidak Lulus");
    }
  }
  
}
