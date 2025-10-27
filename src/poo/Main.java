package src.poo;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Usando como reprodutor musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando como telefone
        meuIphone.ligar("1199999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando como navegador
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}