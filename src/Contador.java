import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //Criando o Scanner para ler os parâmetros
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        //Lendo o primeiro parâmetro
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        //Lendo o segundo parâmetro
        int parametroDois = terminal.nextInt();

        //Bloco try catch para verificar se a exceção deve ser lançada, e bloco finally para fechar o scanner e finalizar o programa, independentemente da exceção ter sido lançada ou não
        try {
            //Chamando o método contar(), para realizar a lógica do programa
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            //Lançando a exceção
            System.out.println();
            System.out.println("[ERRO] - O segundo parâmetro deve ser MAIOR do que o primeiro.");
            System.out.println();
        } finally {
            //Fechando scanner e finalizando o programa
            terminal.close();
            System.out.println("Programa finalizado.");
        }

    }

    //Método para a lógica do programa
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //Verificando se a exceção deve ser lançada ou não
        if (parametroUm > parametroDois || parametroUm == parametroDois) {
            //Lançando a exceção
            throw new ParametrosInvalidosException();
        }

        //Lógica principal do programa
        int contagem = parametroDois - parametroUm;
        System.out.println();
        System.out.println("O intervalo entre " + parametroUm + " e " + parametroDois + " é: " + contagem);
        for (int numero = 1; numero <= contagem; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }
        System.out.println();
    }
}
