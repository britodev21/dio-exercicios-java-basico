import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String mensagem = "Promoção de 20% em todos os produtos.";

        List<Servico> servicos = List.of(
            new Sms(),
            new Email(),
            new RedesSociais(),
            new Whatsapp(),
            new Telegram(),
            new Outlook()
        );

        servicos.forEach(servico -> servico.enviar(mensagem));
    }
}
