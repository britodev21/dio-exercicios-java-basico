public class Whatsapp implements Servico {
    @Override 
    public void enviar(String mensagem) {
        System.out.println("Whatsapp:" + mensagem);
    }
}

