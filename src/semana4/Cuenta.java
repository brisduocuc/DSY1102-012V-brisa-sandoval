package semana4;

public class Cuenta {
    private Cliente cliente;
    private String pin;
    private int saldo;

    public Cuenta(Cliente cliente, String pin, Integer saldo) {
        this.cliente = cliente;
        this.pin = pin;
        this.saldo = saldo;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public void depositar(int valor){
        this.saldo += valor;
    }
    public void retirar(int valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

}
