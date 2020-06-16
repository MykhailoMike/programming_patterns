package main.java.com.mkaloshyn.creational.singleton_03;

public class ProgramRunner {

    public static void main(String[] args) {
        System.out.println(NationalBankOfUkraine.getNbu().toString());
        System.out.println(NationalBankOfUkraine.getNbu().toString());
        System.out.println(NationalBankOfUkraine.getNbu().toString());
        System.out.println(NationalBankOfUkraine.getNbu().toString());

        NationalBankOfUkraine nbu = NationalBankOfUkraine.getNbu();

        NationalBankOfUkraine.getNbu().lend("RaiffaizenBank", 500000L);
        NationalBankOfUkraine.getNbu().lend("KredoBank", 90000L);
        NationalBankOfUkraine.getNbu().readAccountingBook();
    }
}
