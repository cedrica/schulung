import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.service.AccountService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.findAccount(5, new Account[]{new Account("", "", 2),new Account("", "", 12)});
    }
}
