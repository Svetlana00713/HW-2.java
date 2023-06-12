public class Task3 {
    /*
 * Задание 3. 
 * 3. Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder. *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.
 *
*/

 public static void main(String[] args) {
    String str = "a".repeat(111000);
    StringBuilder stringBuilder = new StringBuilder(str);
    
    long start = System.currentTimeMillis();
    str = str.replace("a", "A");
    System.out.println("time String = " + (System.currentTimeMillis() - start));
    start = System.currentTimeMillis();
    for (int i = 0; i < stringBuilder.length(); i++) {
        stringBuilder.setCharAt(i, 'A');
        }
        System.out.println("time StringBuilder = " + (System.currentTimeMillis() - start));
    }
}

