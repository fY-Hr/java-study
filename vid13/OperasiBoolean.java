package vid13;

public class OperasiBoolean {
  public static void main(String[] args) {
    // Operasi boolean adalah seperti berikut:
    // && (AND)
    // || (OR)
    // ! (OPPOSITE (ini ada di unary operator))

    // Operasi boolean umumnya digunakan untuk melakukan pengecekan kondisi
    int nilaiMatematika = 85;
    int nilaiBahasaInggris = 78;
    boolean hadirPenuh = true;

    // Contoh AND (&&): semua kondisi harus true
    boolean lulusAND = nilaiMatematika >= 75 && nilaiBahasaInggris >= 75;
    System.out.println("Lulus (AND): " + lulusAND);

    // Contoh OR (||): minimal satu kondisi true
    boolean lulusOR = nilaiMatematika >= 90 || nilaiBahasaInggris >= 90;
    System.out.println("Lulus beasiswa (OR): " + lulusOR); 

    // Contoh NOT (!): membalik nilai boolean
    boolean tidakHadirPenuh = !hadirPenuh;
    System.out.println("Tidak hadir penuh (!): " + tidakHadirPenuh);

    // Contoh gabungan operasi boolean
    boolean bolehUjianSusulan = !hadirPenuh || (nilaiMatematika < 75 && nilaiBahasaInggris < 75);
    System.out.println("Boleh ujian susulan (gabungan): " + bolehUjianSusulan);
  }
}
