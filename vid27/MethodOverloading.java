package vid27;

public class MethodOverloading {
  public static void main(String[] args) {
    // Pada dasarnya kita tidak bisa membuat method yang memiliki nama yang sama
    // tapi ada yang namanya method overloading, yang memungkinkan kita untuk membuat method yang 
    // memiliki nama yang sama, asalkan parameternya berbeda.
    
    sayHello();
    sayHello("Fakhry");
    sayHello("Fakhry", "Haidar");

    // bisa di compile dan dijalankan, dan tidak akan error.

  }

  public static void sayHello() {
    System.out.println("Hello");
  }

  public static void sayHello(String name) {
    System.out.println("Hello " + name);
  }

  public static void sayHello(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
  }
  
}
