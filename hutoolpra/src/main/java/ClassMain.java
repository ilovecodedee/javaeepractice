import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClassMain {
    public static void main(String[] args) throws IOException {
         Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:/log/log/config.properties");


        props.load(in);
        String name = props.getProperty("name");
        String age = props.getProperty("age");
        System.out.println(name);
        System.out.println(age);
    }
}
