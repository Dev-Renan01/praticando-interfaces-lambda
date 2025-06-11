package EnvioDeMensagens;

public class Mensagens {

    public String smsService(String msg) {
        return "Enviando SMS: " + msg;
    }

    public String emailService(String msg) {
        return "Enviando E-mail: " + msg;
    }

    public String RedesSociaisService (String msg) {
        return "Postando nas Redes Sociais: " + msg;
    }

    public String WhatsAppService(String msg) {
        return "Enviando WhatsApp: " + msg;
    }


}
