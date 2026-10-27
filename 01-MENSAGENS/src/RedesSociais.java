public class RedesSociais implements Servico {
    @Override 
    public void enviar(String mensagem) {
        System.out.println("RedesSociais:" + mensagem);
    }
}

