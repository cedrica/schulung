package de.sdvrz.kbs.manager;

import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.data.Adress;
import de.sdvrz.kbs.service.AccountService;
import de.sdvrz.kbs.service.AdressService;

public class AccountManager {

    private AdressService adressService;
    private AccountService accountService;
    private Account[] accountCenter = new Account[]{

    };
    public AccountManager(){
        accountService = new AccountService();
        adressService = new AdressService();
    }

    public void connectAdressToAccount(int index, Account[] accounts, Adress adress){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getAdress().getId() == adress.getId()){
                Account account = changeAccountName(accounts[i], "Marthe","Zambo");
               // meldeAenderungBeiAccountenter(account);
            }
        }
    }

    private Account changeAccountName(Account account, String firstName, String lastName) {
        account.setFirstName(firstName);
        account.setLastName(lastName);
        return account;
    }
}
