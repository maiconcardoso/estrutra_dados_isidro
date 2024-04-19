package fila;

public class Banco {
    public static void main(String[] args) {
        Fila fila = new Fila();
        int elemento;
        fila.push(1236);
        fila.push(3343);
        fila.push(243);
        fila.push(6566);
        fila.push(5657);
        fila.push(7878);

        System.out.println("Bem vindo ao maiBank");
        System.out.println("---------------------");
        while(!fila.isEmpty()) {
            elemento = fila.pop();
            System.out.println("Próximo a ser atendido: " + elemento);
        }
    }
}
