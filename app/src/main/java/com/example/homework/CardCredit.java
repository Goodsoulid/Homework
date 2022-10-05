package com.example.homework;

public class CardCredit {
    public String accountNumber;
    public int currentAmount;

    public CardCredit(String accountNumber, int currentAmount){
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    void calculateTheAmount(int summ){
        currentAmount = currentAmount + summ;

    }

    void withdrowTheAmount(int summ){
        currentAmount = currentAmount - summ;

    }

    void viewTheRemainder(){
        System.out.println("Текущая сумма " + currentAmount);
    }

}

class Display{
    public static void main(String[] args) {
        CardCredit halvamix = new CardCredit("123456789", 200);
        CardCredit halvamax = new CardCredit("987654321", 300);
        CardCredit halvafull = new CardCredit("456789123", 500);
        halvamix.calculateTheAmount(500);
        halvamax.calculateTheAmount(600);
        halvafull.withdrowTheAmount(200);
        halvamix.viewTheRemainder();
        halvamax.viewTheRemainder();
        halvafull.viewTheRemainder();


    }
}







