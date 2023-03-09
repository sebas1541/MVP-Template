package presenter;
import model.CuentaBancaria;
import view.View;

import java.util.Scanner;

public class Presenter {
    private CuentaBancaria model;
    private CuentaBancaria model1;
    private View view;

    public Presenter() {

        view = new View();
        model = new CuentaBancaria(view.readFloat("Ingrese el saldo de la cuenta origen"), 3.45F);
        model1 = new CuentaBancaria(view.readFloat("Ingrese el saldo de la cuenta destino"), 3.45F);
    }

     public void run() {
        int option = 0;
        while (option != 4) {
            option = showMenu();
            switch (option) {
                case 1:
                    addMoney();
                    break;
                case 2:
                    subMoney();
                    break;
                case 3:
                    transferMoney();
                    break;
                case 4:
                    end();
                    break;
            }
        }
    }

    public int showMenu() {
        int option = view.readInt("Menú principal \n \n1 Consignar \n2 Retirar \n3 Transferir \n4 Salir \n\nInsert option");
        return option;
    }

    /*public void methodName(){
    }
     */
    public void addMoney(){
        model.consignar(Float.parseFloat(view.readString("Ingrese el valor a consignar")));
        System.out.println("El saldo de la cuenta es: " + model.getSaldo());
    }

    public void subMoney(){
        model.retirar(Float.parseFloat(view.readString("Ingrese el valor del retiro")));
        System.out.println("El saldo de la cuenta es: " + model.getSaldo());
    }

    public void transferMoney(){
        model1.consignar(model.transferir(Float.parseFloat(view.readString("Ingrese el valor de la transferencia"))));
        System.out.println("El saldo de la cuenta destino es: " + model1.getSaldo());
    }
    public void end() {
        System.exit(0);
    }


    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.run();
    }
}