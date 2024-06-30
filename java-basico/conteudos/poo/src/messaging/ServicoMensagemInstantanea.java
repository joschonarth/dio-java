package messaging;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviar mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado com a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico de mensagem");
    }
}
