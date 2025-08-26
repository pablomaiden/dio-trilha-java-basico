package br.com.aparelhos.app;

import br.com.aparelhos.genericos.Aparelho;
import br.com.aparelhos.genericos.NavegadorInternet;

class Iphone implements TocadorMusical, Aparelho, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a musica...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligacao.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina.");
    }

}
