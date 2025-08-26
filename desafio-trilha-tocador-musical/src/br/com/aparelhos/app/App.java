package br.com.aparelhos.app;

public class App {

    public static void main(String[] args) {
        iphone();
        android();
    }

    static void iphone(){
        tocar(new Iphone());
    }

    static void android(){
        tocar(new Android());
    }

    static void tocar(Android android){

        System.out.println("--- Iniciando Android ---");
        System.out.println("--- Testando Reprodutor Musical ---");
        android.selecionarMusica("Wake Me Up Before You Go-Go");
        android.tocarMusica();
        android.pausarMusica();
        System.out.println(); // Linha em branco para melhor visualizacao

        System.out.println("--- Testando Aparelho Telefonico ---");
        android.ligar("55-9999-8888");
        android.atender();
        android.iniciarCorreioVoz();
        System.out.println();

        System.out.println("--- Testando Navegador na Internet ---");
        android.exibirPagina("https://www.google.com");
        android.adicionarNovaAba();
        android.atualizarPagina();
    }

    static void tocar(Iphone iphone){

        System.out.println("--- Iniciando Iphone ---");
        System.out.println("--- Testando Reprodutor Musical ---");
        iphone.selecionarMusica("Wake Me Up Before You Go-Go");
        iphone.tocarMusica();
        iphone.pausarMusica();
        System.out.println(); // Linha em branco para melhor visualizacao

        System.out.println("--- Testando Aparelho Telefonico ---");
        iphone.ligar("55-9999-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("--- Testando Navegador na Internet ---");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }


}
