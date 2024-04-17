import banco.Banco;
import banco.Cuenta;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarCuenta(001, 247000, "Luisa Delgadp", "Corriente");
        banco.adicionarCuenta(002, 485000, "Leonardo Parra", "Corriente");
        banco.adicionarCuenta(003, 3660000, "Cristian Cano ", "Ahorros");
        banco.adicionarCuenta(004, 0, "Samuel Velez", "Corriente");

        banco.mostrarListaDeCuentas();

        System.out.println("Total dinero en el banco: $" + banco.calcularTotalDinero());

        System.out.println("Cliente con mayor saldo: " + banco.consultarClienteConMayorSaldo());
    }
}
