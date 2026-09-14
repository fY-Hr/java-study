package vid12;

public class OperasiPerbandingan {

  public static void main(String[] args) {
    // Operasi perbandingan adalah operasi yang selalu menghasilkan benar atau salah (boolean)

    // > (lebih dari)
    // < (kurang dari)
    // >= (lebih dari sama dengan)
    // <= (kurang dari sama dengan)
    // == (sama dengan)
    // != (tidak sama dengan)

    int value1 = 100;
    int value2 = 100;

    System.out.println(value1 > value2); // false
    System.out.println(value1 < value2); // false
    System.out.println(value1 >= value2); // true (karna ada sama dengan)
    System.out.println(value1 <= value2); // true (karna ada sama dengan)
    System.out.println(value1 == value2); // true (karna valu1 dan value2 sama)
    System.out.println(value1 != value2); // false (karna valu1 dan value2 sama)
  }
  
}
