public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String musica;
    private String numero;
    private String url;

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        this.url = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + url);
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.selecionarMusica("Gangsta's Paradise");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
