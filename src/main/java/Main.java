import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.exception.CustomException;
import de.sdvrz.kbs.service.AccountService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        try {
            accountService.findAccount(5, null);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        accountService.findAccount2(2,null );
    }
}
