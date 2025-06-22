package application;

import entities.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone();

        System.out.println("Escolha uma musica: ");
        String musica = sc.nextLine();
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();
        System.out.println();
        System.out.println("Digite um numero para ligar: ");
        String numero = sc.nextLine();
        iphone.ligar(numero);
        iphone.iniciarCorreioVoz();
        iphone.atender();
        System.out.println();
        System.out.println("Digite uma pagina para navega (Url): ");
        String url = sc.nextLine();
        iphone.exibirPagina(url);
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        sc.close();
    }
}