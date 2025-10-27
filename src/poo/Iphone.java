package src.poo;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico,NavegadorNaInternet {

    //campos do iphone

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando o " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada da gata !");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio voz !");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exobindo pagina: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("dado F5");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: "+musica);
    }
}
