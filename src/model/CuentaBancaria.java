package model;

public class CuentaBancaria {

    public float getSaldo() {
        return saldo;
    }

    //class attributes
    float saldo;
    int numeroConsignaciones = 0;
    int numeroMovimientos = 0;
    float tasaAnual;
    float comisionMensual;

    /**
     * Consrtuctors
     * @param saldo
     * @param tasaAnual
     */
    public CuentaBancaria(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float consignar(float cantidad){
        this.numeroConsignaciones++;
        return this.saldo = saldo  + cantidad;
    }

    public float retirar(float cantidad){

        this.numeroMovimientos++;
        if (this.saldo - cantidad <= 0){
            System.out.println("No hay fondos suficientes");
        }else{
            this.saldo = saldo - cantidad;
        }
        return this.saldo;
    }

    public float transferir(float cantidad){

        this.numeroMovimientos++;
        if (this.saldo - cantidad <= 0){
            System.out.println("No hay fondos suficientes");
            return 0;
        }else{
            this.saldo = saldo - cantidad;
            return cantidad;
        }
    }

    /**
    public float calcularInteres(){

    }
    public float extractoMensual(){
pho
    }
     **/


}
