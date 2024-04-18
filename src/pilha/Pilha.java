package pilha;

public class Pilha {
    private int valores[];
    private int topo;
    
    public Pilha() {
        topo = -1;
        valores = new int[10];
    }

    public void push(int elemento) {
        topo++;
        valores[topo] = elemento;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == valores.length - 1);
    }

    public int pop() {
        int elemento = valores[topo];
        topo--;
        return elemento;
    }


}
