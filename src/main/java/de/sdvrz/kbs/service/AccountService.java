package de.sdvrz.kbs.service;

import de.sdvrz.kbs.data.Account;
import de.sdvrz.kbs.exception.CustomException;

public class AccountService {

    private Account[] accountList = new Account[]{
            new Account("", "", 11),
            new Account("", "", 11),
    };
    public Account findAccount(int index, Account[] accountList) throws CustomException {
        //if(accountList == null || index >= accountList.length)
        //    return null;
        if(accountList == null)
            throw new CustomException("AccountList ist null", "Cedric Leumaleu");
       // if(index >= accountList.length)
         //   throw new IndexOutOfBoundsException();
        return accountList[index];
    }

    public Account findAccount(int index) {
        try{
            return accountList[index];
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Account findAccount2(int index, Account[] accountList) {
        System.out.println("Test");
        return accountList[index];
    }
}
