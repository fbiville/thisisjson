package thisisjson;

import org.json.JSONObject;

import java.util.Iterator;

public class ThisIsJson {

    public static void main(String[] args) {
        JSONObject object = new JSONObject(
                "{\n" +
                "\"1 - this is a first key\": \"_\",\n" +
                "  \"2 - oh another key\": \"_\",\n" +
                "  \"3 - and another one!\": \"_\"\n" +
                "}");
        System.out.println(format(object.keys()));
    }

    private static String format(Iterator<String> keys) {
        StringBuilder log = new StringBuilder();
        while (keys.hasNext()) {
            log.append(keys.next());
            log.append(System.lineSeparator());
        }
        return log.toString();
    }
}
