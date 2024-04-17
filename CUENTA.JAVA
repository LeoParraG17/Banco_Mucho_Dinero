package Banco_Mucho_Dinero;

public class Cuenta {
    public int numero;
    public double saldo;
    public String titular;
    public String tipoCuenta; 

    public Cuenta(int numero, double saldo, String titular, String tipoCuenta) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}

    /**
     * Retorna el saldo de la cuenta
     * @return double Entrega el saldo de la cuenta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Entrega el numero de la cuenta
     * @return el numero de la cuenta
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * Entrega el tipo de la cuenta
     * @return el tipo de la cuenta
     */
    public String getTipo() {
        return this.tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método para retirar saldo de la cuenta.
     * @param cantidadARetirar double Cantidad de dinero a retirar de la cuenta
     * @return boolean Indica si se pudo retirar o no
     */
    public boolean retirarSaldo(double cantidadARetirar) {
        if (cantidadARetirar <= this.saldo) {
            this.saldo -= cantidadARetirar;
            return true;
        } else {
            return false;
        }           
    }

    /**
     * Consigna un valor dado a la cuenta
     * @param cantidadAConsignar double La cantidad de dinero a consignar a la cuenta
     */
    public void consignarSaldo(double saldo) {
        this.saldo += saldo;
    }
}
