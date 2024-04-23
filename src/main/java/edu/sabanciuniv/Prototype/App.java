package edu.sabanciuniv.Prototype;

public class App {

    public static void main(String[] args) {


        Account normalAccount = Account.createNormalAccount(new Customer("Remzi"), 4500);
        normalAccount.setIban("2");
        System.out.println(normalAccount.isOpenToWithdraw());
        System.out.println(normalAccount.isOpenToPayment());
        System.out.println(normalAccount.isOpenToTransfer());

        System.out.println();


        Account negativeAccount = Account.createNegativeAccount(new Customer("Mustafa"), -750);
        System.out.println(negativeAccount.isOpenToWithdraw());
        System.out.println(negativeAccount.isOpenToPayment());
        System.out.println(negativeAccount.isOpenToTransfer());

        System.out.println();

        Account frozenAccount = Account.createFrozenAccount(new Customer("Sukran"), -1000);
        System.out.println(frozenAccount.isOpenToWithdraw());
        System.out.println(frozenAccount.isOpenToPayment());
        System.out.println(frozenAccount.isOpenToTransfer());
    }


}
