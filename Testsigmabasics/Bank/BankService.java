package Testsigmabasics.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankService extends Bank {
    static List<Bank> bankerList = new ArrayList<Bank>();
    public void balance_clear(int acc_id,int amt){
        for(Bank bank : bankerList){
            if(bank.accountReturn() == acc_id){
                bank.balanceReturn(amt);
            }
        }
    }
    public boolean searcher(int accountId){
        for(Bank bank : bankerList){
            if(bank.accountReturn() == accountId){
                return true;
            }
        }
        return false;
    }
}