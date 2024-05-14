package telefone;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando");
     }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
     }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
     }
    
}
