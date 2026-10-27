public class Outlook implements Servico{
    @Override
    public void enviar(String mensagem){
        System.out.println("Outlook: " + mensagem);
    }
}
