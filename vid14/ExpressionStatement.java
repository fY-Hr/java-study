package vid14;

import java.util.Date;

public class ExpressionStatement {
  public static void main(String[] args) {
    // Expression adalah konstruksi dari variable, operator dan pemanggilan method yang
    // mengevaluasi menjadi sebuah single value

    // Expression adalah potongan kodee yang menghasilkan value,
    // dan Statement adalah instruksi lengkap yang melakukan aksi, seperti deklarasi, assignment, method call, dll. Dan biasanya diakhiri dengan titik koma (;)
    // Expression statement adalah statement yang mengandung expression didalamnya, seperti assignment, method call, dll

    int value; // deklarasi (ini declaration statement, tapi value-nya adalah expression karena menghasilkan value default yaitu 0)
    value = 10; // assignment (ini adalah statement, tapi 10 adalah expression karena menghasilkan value 10)

    // 2 contoh diatas adalah contoh expression statement, karena meraka adalah statement yang mengandung expression didalamnya.
    // meskipun disebut expression statement, mereka tetap disebut statement karena meraka adalah instruksi lengkap yang melakukan aksi.

    // contoh2 statement:
      // declaration statement
      double aValue = 8776.127; 
      // increment statement
      aValue++;
      // method incovation statement (method call statement)
      System.out.println(aValue);
      // object creation statement
      Date date = new Date();

    // Block statement adalah statement yang terdiri dari beberapa statement yang dibungkus dalam kurung kurawal {}. 
    // Block statement digunakan untuk mengelompokkan beberapa statement menjadi satu unit, seperti pada if statement, for loop, while loop, dll.
      if(aValue > 1000) {
        System.out.println("aValue is " + aValue);
        System.out.println("date is " + date);
      }
  }
}