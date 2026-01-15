import java.io.Serializable;

public class Conta implements Serializable {
    private String titular;
    private int idade;
    private String numero;
    private double saldo;

    public Conta(String titular, int idade, String numero, double saldo) {
        if (idade < 18) throw new IllegalArgumentException("Idade mínima: 18 anos.");
        this.titular = titular;
        this.idade = idade;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + saldo;
    }
}
