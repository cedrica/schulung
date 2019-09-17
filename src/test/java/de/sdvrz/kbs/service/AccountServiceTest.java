package de.sdvrz.kbs.service;

import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.exception.CustomException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

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

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @org.junit.Test//(expected = CustomException.class)
    public void findAccount() throws CustomException {
        /**
         * CASES
         */
        // Liste = null && index beliebig
        // Liste = leer && index beliebig
        // Liste nicht leer && index > Liste.length
        // Liste nicht leer && index < Liste.length

        // 1.
        exceptionRule.expect(CustomException.class);
        assertNull(accountService.findAccount(1,null));
        //2.
        assertNull(accountService.findAccount(1,new Account[]{}));
        //3.
        assertNull(accountService.findAccount(10,new Account[]{
                new Account("Cedric","Leumaleu",23),
                new Account("Wilfried","Rodman",13),}));
        //4.
        assertNotNull(accountService.findAccount(0,new Account[]{
                new Account("Cedric","Leumaleu",23),
                new Account("Wilfried","Rodman",13),}));
    }

    @org.junit.Test
    public void findAccount2() {
        /**
         * CASES
         */
        // Liste = null && index beliebig
        // Liste = leer && index beliebig
        // Liste nicht leer && index > Liste.length
        // Liste nicht leer && index < Liste.length

        // 1.
        assertNull(accountService.findAccount2(1,null));
        //2.
        assertNull(accountService.findAccount2(1,new Account[]{}));
        //3.
        assertNull(accountService.findAccount2(10,new Account[]{
                                                        new Account("Cedric","Leumaleu",23),
                                                        new Account("Wilfried","Rodman",13),}));
        //4.
        assertNotNull(accountService.findAccount2(0,new Account[]{
                                                        new Account("Cedric","Leumaleu",23),
                                                        new Account("Wilfried","Rodman",13),}));
    }
}