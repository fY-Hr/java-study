package vid29;

public class Scope {
  public static void main(String[] args) {
    // Scope adalah daerah dimana variable dapat diakses.
    // Scope dapat berupa class, method, atau block.
    // Scope dapat berupa local variable, atau global variable.
    // Scope dapat berupa parameter, atau return value.

    sayHello("Fakhry");
  }
  public static void sayHello(String name) {
    // disini name adalah local variable, yang hanya dapat diakses di dalam method sayHello.
    // name disini adalah parameter.
    String hello = "Hello, " + name + "!";
    System.out.println(hello); 

    // System.out.println(hi); // hi tidak bisa diakses karena deklarasi variable hi ada di dalam block if statement..
    // karna jika dijalankan, akan error karena variable hi tidak dideklarasi di dalam block sayHello.

    if(!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
      System.out.println(hello); // hello bisa diakses karena if statement ada di dalam block sayHello.
      // jadi if statement disini mewarisi scope dari method sayHello, tapi tidak sebaliknya.
    }
  }
}
