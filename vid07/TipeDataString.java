package vid07;

public class TipeDataString {
  public static void main (String[] args) {

    // Perbedaan string dengan char adalah penggunaan tanda petik.
    // Pada string, menggunakan petik dua (""), sedangkan char petik satu ('')

    String firstName = "Fakhry";
    String lastName = "Haidar";
    String fullName = firstName + " " + lastName;

    // Jika sebuah string kosong, maka nilainya binary-nya adalah NULL sehingga tidak memakan memori sama sekali   
    String nullString = ""; 

    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(fullName);

    System.out.println(nullString.getClass().getName()); 
    // Dan meskipun kosong, tipe datanya tetap string

    
  }
}