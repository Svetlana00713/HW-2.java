public class Task1 {
    /*
 * Задание 1. 
 * 1. Дана строка sql-запроса ""select * from students where "". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {""name"":""Ivanov"", ""country"":""Russia"", ""city"":""Moscow"", ""age"":""null""}
 *
*/
    public static void main(String[] args) {
        String sqlQuery = "SELECT * FROM students WHERE ";
        String filters = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}";
        StringBuilder whereClause = new StringBuilder();

        String[] filterPairs = filters.replaceAll("[{}\"]", "").split(",");
        for (String pair : filterPairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (!value.equalsIgnoreCase("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append(" AND ");
                }
                whereClause.append(key).append("='").append(value).append("'");
            }
        }

        if (whereClause.length() == 0) {
            sqlQuery += "1=1;";
        } else {
            sqlQuery += whereClause.toString() + ";";
        }

        System.out.println(sqlQuery);
    }
}
    

