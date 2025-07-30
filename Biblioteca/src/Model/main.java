package Model;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bl = new Biblioteca("12.335.067/0001-60", "(84) 91210-1457",
                "Rua de Spike nervoso, 178, Caruaru - PE");

        int opcao = 0;        
        do{
            System.out.println("0 - sair \n"+
                               "1 - Adicionar despesa \n"+
                               "2 - Remover despesa \n"+
                               "3 - Adicionar Cliente \n"+
                               "4 - Remover cliente \n"+
                               "5 - Adicionar funcionário \n"+
                               "6 - Remover funcionário\n"+
                               "7 - Adicionar livro\n"+
                               "8 - Remover livro"
                               );
            System.out.println("Digite a opção desejada");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0: {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                case 1: {
                    System.out.println("Digite os dados exigidos do sistema: ");
                    System.out.println("Digite o nome despesa: ");
                    String nome = sc.next();
                    System.out.println("Digite a descrição");
                    String descricao = sc.next();
                    System.out.println("Digite o valor: ");
                    double valor = sc.nextDouble();
                    bl.adicionarDespesa(nome, descricao, valor);
                    break;
                }
                case 2: {
                    System.out.println("Digite o nome despesa para ser removida: ");
                    String nome = sc.next();
                    bl.removerDespesa(nome);
                    break;
                }
                case 3: {
                    System.out.println("Digite os dados cadastrais exigidos:");
                    System.out.println("Digite o nome: ");
                    String nome = sc.next();
                    System.out.println("Digite o cpf: ");
                    String cpf = sc.next();
                    System.out.println("Digite o endereco: ");
                    String endereco = sc.next();
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    bl.adicionarcliente(nome, cpf, endereco, idade);
                    break;
                }
                case 4: {
                    System.out.println("Digite o cpf do cliente a ser removido: ");
                    String cpf = sc.next();
                    bl.removercliente(cpf);
                    break;
                }
                case 5: {
                    System.out.println("Digite os dados cadastrais exigidos:");
                    System.out.println("Digite o nome: ");
                    String nome = sc.next();
                    System.out.println("Digite o cpf: ");
                    String cpf = sc.next();
                    System.out.println("Digite a endereço: ");
                    String endereco = sc.next();
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Qual a escolaridade? ");
                    String escolaridade = sc.next();
                    System.out.println("Qual a formação?: ");
                    String formacao = sc.next();
                    bl.adicionarFuncionario(nome, cpf, endereco, idade, escolaridade, formacao);
                    break;
                }
                case 6: {
                    System.out.println("Digite o cpf do funcionário a ser removido: ");
                    String cpf = sc.next();
                    bl.removerFuncionario(cpf);
                    break;
                }
                case 7: {
                    System.out.println("Digite os dados exigidos do sistema: ");
                    System.out.println("Digite o nome do livro: ");
                    String nome = sc.next();
                    System.out.println("Digite o número de série do livro: ");
                    int numeroDeSerie = sc.nextInt();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autor = sc.next();
                    System.out.println("Digite o número de páginas do livro: ");
                    int numeroDePaginas = sc.nextInt();
                    System.out.println("Digite o valor do livro: ");
                    double valor = sc.nextDouble();
                    bl.adicionarLivro(nome, numeroDeSerie, autor, numeroDePaginas, valor);
                    break;
                }
                case 8: {
                    System.out.println("Digite o número de série do livro a ser removido: ");
                    int numeroDeSerie = sc.nextInt();
                    bl.removerLivro(numeroDeSerie);
                    break;
                }
            }
        } while (opcao < 1 || opcao > 8);
    }
    
    
}