package vid09;

public class TipeDataNonPrimitif {
  public static void main(String[] args){
    // Tipe data primitif adalah tipe data bawaan dari bahasa pemrograman (char, int, bool, etc)
    // Tipe data primitif tidak bisa diganti, dan memiliki default value sendiri

    // Tipe data non primitif adalah tipe data yang tidak memiliki default value, dan bisa bernilai null
    // Tipe data primitif merupakan sebuah objek sehingga bisa memiliki method/properti bawaan
    // Di Java semua tipe data primitif memiliki representasi tipe data non primitifnya

    // Biasanya hanya berbeda di kapitalisasinya:
    /*
      (primitif -> non-primitif)
      byte -> Byte
      short -> Short
      int -> Integer
      long -> Long
      float -> Float
      double -> Double
      char -> Character
      bool -> Boolean
    */

    // Deklarasi dan inisialisasinya sama saja
    Integer iniInteger = 10;
    Long iniLong = 10000L;

    // Tapi bedanya bisa diisi null
    Byte iniByte = null; // dan tidak error

    // atau bahkan
    Byte iniByte2;
    
    System.out.println(iniByte);
    // System.out.println(iniByte2);

    // kalau mau di print harus di inisialisasikan value terlebih dahulu
    iniByte2 = 8;

    System.out.println(iniByte2);
    

    // Jika ingin melakukan konversi dari primitif ke non-primitif:
    int iniInt = 100;
    Integer iniInteger2 = iniInt;

    System.out.println(iniInteger2.getClass().getName()); 
    // Contoh lain:
    int age = 20;

    Integer ageObject = age;

    int ageAgain = ageObject;

    // Karna Integer bukanlah perwakilan non primitif dari short dan long meski sama-sama number
    // maka perlu menggunakan method secara spesifik:
    short ageShort = ageObject.shortValue();
    long ageLong = ageObject.longValue();

    // Sebenarnya int juga melakukan hal yang sama, tapi karna int merupakan versi primitif
    // dari Integer, maka java secara otomatis melakukan unboxing:
    int ageAgain2 = ageObject; // ageObject.intValue()
  }
}
