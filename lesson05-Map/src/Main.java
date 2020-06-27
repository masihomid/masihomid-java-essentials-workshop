import java.util.HashMap;
import java.util.Map;

public class Main {

            public static void main(String[] args) {
            Map map = new HashMap();

            map.put("number", 1);
            map.put("text", "hola");
            map.put("decimal", 5.7);
            map.put("salam","Hello");

            System.out.println(map.get("text"));

            if (!map.containsKey("byte")) {
                System.out.println("There are no bytes here!");
            }

                System.out.println(map.entrySet());


                System.out.println(map.keySet());

        }
    }

