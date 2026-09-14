/*
  Dua tipe data number:
  - Integer Number (bilangan bulat)
  - Floating Point Number (bilangan pecahan)

  Jenis Integer Number:
  byte: 1 byte
  short: 2 bytes
  int: 4 bytes
  long: 8 bytes

  Jenis Floating Point Number:
  float: 4 bytes
  double: 8 bytes

  namun jika kita tidak assign value apapun ke dalam variabel yang kita buat maka size defaultnya
  adalah 0 byte

  dan untuk value min maxnya silahkan di searching saja
*/

package vid04;

public class TipeDataNumber {
  public static void main(String[] args) {
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 1000000;
    long iniLong = 1000000;
    long iniLong2 = 1000000L; // L di akhir hanya untuk menandakan bahwa ini adalah long

    float iniFloat = 10.12F; // F sama seperti L diatas hanya untuk menandakan bahwa ini adalah float
    double iniDouble = 12.2424;

    // Literals
    int decimalInt = 25; // decimal based
    int hexInt = 0xA132B; // hexadecimal based
    int binInt = 0b01010101; // binary based

    // Underscore (fitur untuk mempermudah membaca digit angka, dan tidak akan berpengaruh apa apa)
    long balance = 1_000_000_000_000L; 
    int sum = 60_000_000;

    // Number Data Type Conversion (Konversi tipe data number)
    // Widening Casting (Otomatis): byte->short->int->long->float->double
    byte thisByte = 100;
    short thisShort = thisByte;
    int thisInt = thisByte;
    long thisLong = thisByte;
    float thisFloat = thisByte;
    double thisDouble = thisByte;
    // Narrowing Casting (Manual): double->float->long->int->short->byte
    double thisDouble2 = 1.52445;
    float thisFloat2 = (float) thisDouble2;
    long thisLong2 = (long) thisDouble2;
    int thisInt2 = (int) thisDouble2;
    short thisShort2 = (short) thisDouble2;
    byte thisByte2 = (byte) thisDouble2;
    // Catatan untuk narrowing, hal ini bisa memotong value dari number yang di cast
  }
}