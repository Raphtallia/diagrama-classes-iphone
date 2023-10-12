public class iPhone implements MusicPlayer, Phone, InternetBrowser {

    public void reproduzir() {
    System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void ligar() {
        System.out.println("Fazendo uma ligação");
    }

    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da web");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }

    public void tocarMusica() {
        System.out.println("Tocando música no iPhone");
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.tocarMusica();
        meuiPhone.ligar();
        meuiPhone.exibirPagina();
    }
}