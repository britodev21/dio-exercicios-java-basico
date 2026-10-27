public class Telegram implements Servico {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Telegram: " + mensagem);
    }
}
