import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class Welcome {
    public static void main(String[] args){
        String s = "qwertyuiopas";
        String base64encodedString = Base64.getEncoder()
                .encodeToString(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(base64encodedString);
    }

}
