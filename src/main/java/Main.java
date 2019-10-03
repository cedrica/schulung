import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.exception.CustomException;
import de.sdvrz.kbs.service.AccountService;
import org.apache.commons.text.StringEscapeUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        try {
            accountService.findAccount(5, null);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        String json = StringEscapeUtils.escapeJson("{annna:1}");
        accountService.findAccount2(2,null );
    }
}
