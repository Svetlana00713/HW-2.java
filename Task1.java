import java.util.HashMap;
import java.util.Map;
  
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moskow");
        params1.put("age",null);
        System.out.println(getQuery(params1));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
}
    
