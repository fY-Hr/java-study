package vid25;

public class MethodReturnValue {

  /*
    Method dapat mengembalikan nilai, dan nilai yang dikembalikan adalah apapun yang berada setelah keyword return.
    Method dapat mengembalikan nilai apa saja, dan dapat berupa tipe data apa saja, dengan catatan:
    Tipe datanya harus sesuai dengan tipe data yang dikembalikan pada method tersebut. (public statis int) maka harus mengembalikan int
    Namun pada method yang mengembalikan tipe data void, maka tidak perlu mengembalikan nilai, dan di dalamnya tidak ada return statement, atau return statement dengan nilai null.
  */
  public static void main(String[] args) {
    int result = sayHello("Fakhry");

    System.out.println(result);;
  }

  public static int sayHello(String name) {
    System.out.println("Hello, " + name + "!");
    return 1 + 1;
  }
  
}
