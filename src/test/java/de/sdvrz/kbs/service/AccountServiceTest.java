package de.sdvrz.kbs.service;

import de.sdvrz.kbs.data.Account;
import org.junit.Before;

import static org.junit.Assert.*;

public class AccountServiceTest {
    private Account[] accountsMock =
            {
                    new Account("Cedric", "Leumaleu", 23),
                    new Account("Cihan", "Aliogu", 23),
                    new Account("Martina", "ingis", 23)
            };
    private AccountService accountService;
    @Before
    public void init(){
        accountService = new AccountService();
    }


    @org.junit.Test
    public void findAccount() {
        /**
         * CASES
         */
        // Liste = null && index beliebig
        // Liste = leer && index beliebig
        // Liste nicht leer && index > Liste.length

        // 1.
       // assertNull(accountService.findAccount(1,null));
        //2.

    }
}