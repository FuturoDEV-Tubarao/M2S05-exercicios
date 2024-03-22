package br.com.futurodev.heroi.view;

import java.util.Scanner;

import br.com.futurodev.heroi.model.Heroi;

public class HeroiView {
    
    public void exibirMenu() {
        System.out.println();
        System.out.println("-------- MENU --------");
        System.out.println();
        System.out.println("1 - Adicionar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println();
    }

    public String obterCodigoOperacao() {
        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.next();  // string 
        System.out.println();
        return opcao;
    }

    //TODO: Adicionar a cor respectiva de acordo com o tipo de mensagem!
    public void exibirMensagemErro(String mensagem) {
        System.out.println(mensagem);
        System.out.println();
    }

    public void exibirMensagemSucesso(String mensagem) {
        System.out.println(mensagem);
        System.out.println();
    }

    public void exibirMensagemInfo(String mensagem) {
        System.out.println(mensagem);
        System.out.println();
    }

    public void aguardar() {
        System.out.println("Pressione qualquer tecla para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println();
    }

    public Heroi obterDados() {
        System.out.print("Cadastro de Herói: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String uf = scanner.nextLine();
        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();
        return new Heroi(nome, uf, idade);
    }

    public void exibirDados(Heroi heroi) {
        System.out.println(String.format("Herói: %s, superpoder: %s, idade: %d",
                heroi.getNome(), heroi.getSuperpoder(), heroi.getIdade()));
    }

}
