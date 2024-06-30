package messagingservice;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
