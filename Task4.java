public class Task4 {
    public static void main(String[] args) {
        String s = ".3 + 1.56 = ";
        String[] exp = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append(Double.parseDouble(exp[0]) + Double.parseDouble(exp[2]));
        System.out.println(stringBuilder);
    }
}
    


