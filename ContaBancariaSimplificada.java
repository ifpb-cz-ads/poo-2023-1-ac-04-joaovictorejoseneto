public class ContaBancariaSimplificada {
    private String nomeDoCorrentista;
    private float saldo;
    private boolean contaEEspecial;

    public ContaBancariaSimplificada( float saldo, boolean contaEEspecial) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
        this.contaEEspecial = contaEEspecial;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isContaEEspecial() {
        return contaEEspecial;
    }

    public void setContaEEspecial(boolean contaEEspecial) {
        this.contaEEspecial = contaEEspecial;
    }

    public void sacar(float valor){
        if(!contaEEspecial){
            if(saldo < valor){
                System.out.println("Não é possivel sacar");
                return;
            }
        }
        setSaldo(this.saldo-valor);
        System.out.println("Concluido");
    }

    public void depositar(float valor){
        setSaldo(this.saldo + valor);
    }

    public void mostrarDados(){
        System.out.println("O nome do correntista é %s \nO saldo da conta é %f");
        if(contaEEspecial){
            System.out.println("Sua conta é especial");
            if(saldo < 0){
                System.out.println("Você está com saldo negativo");
            }
            return;
        }
        System.out.println("Sua conta não é especial");
    }
}
