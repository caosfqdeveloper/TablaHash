
public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Insertar valores en la tabla hash
        hashTable.insert(115269, "linear");
        hashTable.insert(111254, "quadratic");
        hashTable.insert(112233, "open");

        // Buscar valores en la tabla hash
        System.out.println("Search 115269: " + hashTable.search(115269)); // Debería devolver true
        System.out.println("Search 111254: " + hashTable.search(111254)); // Debería devolver true
        System.out.println("Search 112233: " + hashTable.search(112233)); // Debería devolver true

        // Eliminar valores de la tabla hash
        hashTable.remove(115259);
        hashTable.remove(111254);
        hashTable.remove(112233);

        // Verificar si los valores eliminados siguen presentes en la tabla hash
        System.out.println("Search 115259 after removal: " + hashTable.search(115259)); // Debería devolver false
        System.out.println("Search 111254 after removal: " + hashTable.search(111254)); // Debería devolver false
        System.out.println("Search 112233 after removal: " + hashTable.search(112233)); // Debería devolver false
    }
}
