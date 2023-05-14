
package com.main;

import com.clases.clsCard;
import com.clases.clsDeposit;
import com.clases.clsWithdraw;
import com.forms.frmHome;
import java.util.Scanner;

//Application that allows to deposit and withdraw
public class BankApp {

    public static void main(String[] args) {
        frmHome bank = new frmHome();
        
        double saldo, dineroDepositar, dineroRetirar;
        int option;
        String moneda = "";
        
        clsCard cuenta = new clsCard();
        clsDeposit deposito = new clsDeposit();
        clsWithdraw retiro = new clsWithdraw();
        
//        Scanner miTeclado = new Scanner(System.in);
//        System.out.println("Ingrese saldo de la cuenta en soles");
//        saldo = miTeclado.nextDouble();
//        cuenta.setDineroCuentaSoles(saldo);
//        System.out.println("Ingrese saldo de la cuenta en dolares");
//        saldo = miTeclado.nextDouble();
//        cuenta.setDineroCuentaDolares(saldo);
//        System.out.println("\nCuenta soles: S/" + cuenta.getDineroCuentaSoles() );
//        System.out.println("Cuenta dolares: $" + cuenta.getDineroCuentaDolares() );
        
//        option = menu();
//        
//        switch (option) {
//            case 1:
//                System.out.println("Ingrese moneda (Soles o Dolares): ");
//                moneda = miTeclado.next();
//                System.out.println("Ingrese dinero a depositar: ");
//                dineroDepositar = miTeclado.nextDouble();
//                deposito.Depositar(dineroDepositar, moneda, cuenta);
//                break;
//            case 2:
//                System.out.println("Ingrese moneda (Soles o Dolares): ");
//                moneda = miTeclado.next();
//                System.out.println("Ingrese dinero a retirar: ");
//                dineroRetirar = miTeclado.nextDouble();
//                retiro.Retirar(dineroRetirar, moneda, cuenta);
//                break;
//            default:
//                throw new AssertionError();
//        }
//        
//    }
    
//    public static int menu() {
//        int option = 0;
//        Scanner miTeclado = new Scanner(System.in);
//        do {
//            System.out.println("MENU");
//            System.out.println("1.Depositar");
//            System.out.println("2.Retirar");
//            System.out.println("3.Salir");
//            option = miTeclado.nextInt();
//        } while(option<1 || option>3);
//        return option;
    }
}
