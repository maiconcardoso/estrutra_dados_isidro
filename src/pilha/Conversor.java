package pilha;

public class Conversor {
    public static void main(String[] args) {
        //int numero = Integer.parseInt(args[0]);
        int numero = 172;
        Pilha pilha = new Pilha();

        int resto = 0;

        // Fase 1: Empilhamento do resto da divisão
        while(numero != 0) {
            resto = numero % 2; // Pego o resto da divisão (0 ou 1)
            pilha.push(resto);
            numero /= 2;
        }

        // Fase 2: Exibição do valor em binários
        while (!pilha.isEmpty()) {
            resto = pilha.pop();
            System.out.print(resto);
        }
        System.out.println("\nFim do programa!");
    }
}
