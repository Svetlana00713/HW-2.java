import java.io.File;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        printJson();
    }

    public static <ObjectMapper, JsonNode, JsonNode> void printJson(){
        File jsonFilePath = new File("src/main/resources/json1.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = ((Object) objectMapper).readTree(jsonFilePath);
            StringBuilder stringBuilder = new StringBuilder();
            for (JsonNode studentNode: jsonNode) {
                String lastname = ((Object) studentNode).get("фамилия").asText();
                String feedback = ((Object) studentNode).get("оценка").asText();
                String subject  = ((Object) studentNode).get("предмет").asText();

                stringBuilder
                        .append("Студент [")
                        .append(lastname).append("] получил [").append(feedback).append("] по предмету [").append(subject).append("]");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}