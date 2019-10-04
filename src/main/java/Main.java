import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
       /* AccountService accountService = new AccountService();
        try {
            accountService.findAccount(5, null);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        String json = StringEscapeUtils.escapeJson("{annna:1}");
        accountService.findAccount2(2,null );*/


        Properties prop = new Main().loadPropertiesFile("prod.properties");
        System.out.printf(prop.get("java.version").toString());
    }

    public void foo(){

    }

    public Properties loadPropertiesFile(String filePath) {

        Properties prop = new Properties();

        try  {
            InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filePath);
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }

        return prop;

    }
}
