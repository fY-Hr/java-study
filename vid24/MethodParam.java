package vid24;

public class MethodParam {

  /*
    Method dapat menerima parameter, dan parameter adalah data yang diberikan kepada method.
    Parameter dapat berupa tipe data apa saja, dan dapat berupa tipe data array.
    Parameter dapat berupa tipe data non primitif, dan dapat berupa tipe data primitif.
    Parameter dapat berupa tipe data array of non primitif, dan dapat berupa tipe data array of primitif.
  */

  public static void main(String[] args) {
    sayHello("Fakhry");
  }

  public static void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
  }
  
}
