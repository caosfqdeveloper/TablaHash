
import java.util.LinkedList;

public class HashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<Integer>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Función hash H(x) = x mod 10
    private int hashFunction(int value) {
        return value % TABLE_SIZE;
    }

    // Método para insertar un valor en la tabla hash con manejo de colisiones
    public void insert(int key, String collisionMethod) {
        int index = hashFunction(key);
        switch (collisionMethod) {
            case "linear":
                while (!table[index].isEmpty()) {
                    index = (index + 1) % TABLE_SIZE;
                }
                break;
            case "quadratic":
                int i = 1;
                while (!table[index].isEmpty()) {
                    index = (index + i * i) % TABLE_SIZE;
                    i++;
                }
                break;
            case "open":
                while (!table[index].isEmpty()) {
                    index = (index + 1) % TABLE_SIZE;
                }
                break;
            default:
                System.out.println("Método de manejo de colisiones no válido.");
                return;
        }
        table[index].add(key);
    }

    // Método para buscar un valor en la tabla hash
    public boolean search(int value) {
        int index = hashFunction(value);
        return table[index].contains(value);
    }

    // Método para eliminar un valor de la tabla hash
    public void remove(int value) {
        int index = hashFunction(value);
        table[index].remove((Integer) value);
    }
}
