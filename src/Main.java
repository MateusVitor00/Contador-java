import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o Primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o Segundo parâmetro: ");
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroUm, parametroDois);
        } catch (Exception parametroInvalidoException) {
            System.out.println(parametroInvalidoException);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws parametroInvalidoException {
        if (parametroUm > parametroDois) {
            throw new parametroInvalidoException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo numero: " + (i+1));
        }


    }
}