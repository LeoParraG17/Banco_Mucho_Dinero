import java.util.ArrayList;
import java.util.List;


public class SumarPromediarSaldos {

    public static void main(String[] args) {
        // Crear una lista de cuentas
        List<Cuenta> cuentas = new ArrayList<>();

        // Agregar cuentas a la lista
        cuentas.add(new Cuenta("Cuenta 1", 1000.00));
        cuentas.add(new Cuenta("Cuenta 2", 500.00));
        cuentas.add(new Cuenta("Cuenta 3", 2000.00));

        // Variable para almacenar el saldo total
        double saldoTotal = 0.0;

        // Recorrer la lista de cuentas utilizando el bucle for-each
        for (Cuenta cuenta : cuentas) {
            saldoTotal += cuenta.getSaldo();
        }

        // Calcular el promedio de saldos
        double promedioSaldo = saldoTotal / cuentas.size();

        // Mostrar el saldo total y el promedio de saldos
        System.out.println("Saldo total: " + saldoTotal);
        System.out.println("Promedio de saldos: " + promedioSaldo);
    }
}

class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
}
