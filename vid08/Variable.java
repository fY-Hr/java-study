package vid08;

public class Variable {

  public static void main (String[] args) {

    // Konsep variable pada java sama seperti konsep umum dari variable di pemrograman
  
    // Namun karna java adalah bahasa static type, maka variable tidak bisa menampung nilai yang
    // berbeda dari tipe data deklarasi variable tersebut. Semisalkan di deklarasi dengan String,
    // maka seterusnya nilai variable tersebut harus bertipe data String meskipun isinya ganti2
  
    String name;
    name = "Aloha";
  
    int age = 120;
    String country = "Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(country);


    // Sejak java 10, java mendukung pembuatan variable dengan kata kunci var, seperti di javascript.
    // Tapi jika kita menggunakan var, maka kita harus langsung mengisi value dari variable tersebut
    // agar java bisa mengidentifikasi tipe data variabel tersebut secara otomatis.

    var firstName = "Fakhry";
    var lastName = "Haidar";

    System.out.println(firstName + " " + lastName);
    System.out.println(firstName.getClass().getName()); // Dan tipe datanya pun String

    // final variable
    // simpelnya ini adalah const di javascript

    final String application = "Belajar Java";
    // jka variable ini dicoba untuk dideklarasi ulang, maka akan error

    System.out.println(application);
  }

  
  
}
