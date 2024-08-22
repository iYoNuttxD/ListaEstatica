package ListaEstatica;

public class Main {
    public static void main(String[] args) {
        try {
            // Criação de uma lista com capacidade para 5 elementos
            Lista lista = new Lista(5);
            System.out.println("Lista inicial: " + lista.toString()); // []

            // Testando add(int value)
            lista.add(10);
            lista.add(20);
            lista.add(30);
            System.out.println("Após adicionar 10, 20 e 30: " + lista.toString()); // [10, 20, 30]

            // Testando add(int value, int pos)
            lista.add(15, 1); // Adiciona 15 na posição 1
            System.out.println("Após adicionar 15 na posição 1: " + lista.toString()); // [10, 15, 20, 30]

            // Testando getSize()
            System.out.println("Tamanho atual da lista: " + lista.getSize()); // 4

            // Testando setData(int value, int pos)
            lista.setData(25, 2);
            System.out.println("Após alterar valor na posição 2 para 25: " + lista.toString()); // [10, 15, 25, 30]

            // Testando remove(int pos)
            lista.remove(1); // Remove o elemento na posição 1
            System.out.println("Após remover o elemento na posição 1: " + lista.toString()); // [10, 25, 30]

            // Testando find(int value)
            int pos = lista.find(25);
            System.out.println("Posição do valor 25: " + pos); // 1

            // Testando getData(int pos)
            int value = lista.getData(2);
            System.out.println("Valor na posição 2: " + value); // 30

            // Testando clear()
            lista.clear();
            System.out.println("Após limpar a lista: " + lista.toString()); // []

            // Testando isEmpty() e isFull()
            System.out.println("A lista está vazia? " + lista.isEmpty()); // true
            lista.add(5);
            lista.add(15);
            lista.add(25);
            lista.add(35);
            lista.add(45);
            System.out.println("Após adicionar vários elementos: " + lista.toString()); // [5, 15, 25, 35, 45]
            System.out.println("A lista está cheia? " + lista.isFull()); // true

            // Tentativa de adicionar um elemento em uma lista cheia (deve lançar exceção)
            lista.add(55); // Isso deve lançar uma exceção
        } catch (IllegalAccessException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
