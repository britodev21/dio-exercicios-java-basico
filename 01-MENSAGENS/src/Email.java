public class Email implements Servico {
    @Override 
    public void enviar(String mensagem) {
        System.out.println("Email:" + mensagem);
    }
}
