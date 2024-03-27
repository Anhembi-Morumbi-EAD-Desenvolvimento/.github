package Main.Controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int opcao;
        do {
            System.out.println("\nBem-vindo ao Sistema de Cadastro e Notificação de Eventos!");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar evento");
            System.out.println("3 - Consultar eventos");
            System.out.println("4 - Participar de um evento");
            System.out.println("5 - Consultar eventos participados");
            System.out.println("6 - Cancelar participação em evento");
            System.out.println("7 - Consultar eventos próximos");
            System.out.println("8 - Consultar eventos passados");
            System.out.println("9 - Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistema.cadastrarUsuario();
                    break;
                case 2:
                    sistema.cadastrarEvento();
                    break;
                case 3:
                    sistema.consultarEventos();
                    break;
                case 4:
                    sistema.participarEvento();
                    break;
                case 5:
                    sistema.consultarEventosParticipados();
                    break;
                case 6:
                    sistema.cancelarParticipacao();
                    break;
                case 7:
                    sistema.consultarEventosProximos();
                    break;
                case 8:
                    sistema.consultarEventosPassados();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);
    }
}

