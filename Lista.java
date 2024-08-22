package ListaEstatica;

import java.util.Arrays;

public class Lista {
    private int[] data;
    private int size;

    public Lista(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = 0;
        }
        size = 0;
    }

    public void add(int value) throws IllegalAccessException {
        if (isFull()) {
            throw new IllegalAccessException("Lista Cheia");
        }
        data[size++] = value;
    }

    public void add(int value, int pos) throws IllegalAccessException {
        if (isFull()) {
            throw new IllegalAccessException("Lista Cheia");
        }
        if (pos < 0 || pos > size) {
            throw new IllegalAccessException("Posição Inválida");
        }

        //Vai deslocando para direita, deixando um espaço a ser adicionado
        for (int i = size; i > pos; i--){
            data[i] = data[i - 1];
        }
        data[pos] = value;
        size++;
    }

    public void remove(int pos) {
        if (isEmpty()) {
            throw new IllegalStateException("Lista Vazia");
        }
        if (pos < 0 || pos >= size) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        //Desloca para esquerda, sobrescrevendo o dado a ser removido
        for (int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        //Apaga o dado duplicado ao final
        data[size - 1] = 0;
        size--;
    }

    public void setData(int value, int pos) {
        if (isEmpty()) {
            throw new IllegalStateException("Lista Vazia");
        }
        if (pos < 0 || pos >= size) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        data[pos] = value;
    }

    public int getData(int pos) {
        if (isEmpty()) {
            throw new IllegalStateException("Lista Vazia");
        }
        if (pos < 0 || pos >= size) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return data[pos];
    }

    public int find(int value) {
        if (isEmpty()) {
            throw new IllegalStateException("Lista Vazia");
        }
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

}
