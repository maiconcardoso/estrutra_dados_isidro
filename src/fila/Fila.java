package fila;

public class Fila {
    private int[] valores;
    private int inicio;
    private int fim;
    private int total;

    public Fila() {
        this.valores = new int[10];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    public void push(int elemento) {
        valores[fim] = elemento;
        fim = (fim + 1) % 10;
        total++;
    }

    public int pop() {
        int elemento = valores[inicio];
        inicio = (inicio + 1) % 10;
        total--;
        return elemento;
    }

    public boolean isEmpty() {
        return (total == 0);
    }

    public boolean isFull() {
        return (total == 10);
    }
}


