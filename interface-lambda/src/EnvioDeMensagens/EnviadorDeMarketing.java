package EnvioDeMensagens;

import java.util.List;

public class EnviadorDeMarketing{

    private Mensagens mensagens;

    public EnviadorDeMarketing() {
        this.mensagens = new Mensagens();
    }

    public void enviarMensagemParaTodos(String mensagem) {
        System.out.println(mensagens.emailService(mensagem));
        System.out.println(mensagens.RedesSociaisService(mensagem));
        System.out.println(mensagens.smsService(mensagem));
        System.out.println(mensagens.WhatsAppService(mensagem));
    }
}