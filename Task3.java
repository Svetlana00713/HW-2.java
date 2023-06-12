public class Task3 {
    /*
 * Задание 3. 
 * 3. Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder. *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.
 *
*/
    public static void main(String[] args) {
        String s = ".3 + 1.56 = ";
        long startTime = System.nanoTime(); //замер времени для String
        s = s.replaceAll("a", "A");
        double result = 1.86;
        s += result;
        long endTime = System.nanoTime();
        long durationString = (endTime - startTime);

        StringBuilder sb = new StringBuilder(".3 + 1.56 = ");
        startTime = System.nanoTime(); //замер времени для StringBuilder
        sb = sb.append(result);
        int aIndex = sb.indexOf("a");
        if (aIndex != -1) {
            sb.replace(aIndex, aIndex + 1, "A");
        }
        endTime = System.nanoTime();
        long durationStringBuilder = (endTime - startTime);

        System.out.println("String duration: " + durationString);
        System.out.println("StringBuilder duration: " + durationStringBuilder);
    }
}
    

