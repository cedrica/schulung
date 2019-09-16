package de.sdvrz.kbs.service;

import de.sdvrz.kbs.data.Account;

public class AccountService {


    public Account findAccount(int index, Account[] accountList) {
        //if(accountList == null || index >= accountList.length)
        //    return null;
        return accountList[index];
    }
}
