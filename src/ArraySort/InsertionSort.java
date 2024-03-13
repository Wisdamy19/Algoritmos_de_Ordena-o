package ArraySort;

// Insertion Sort

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 9, 4, 11, 6}; // array
        insertionSort(array); // função com o array de argumento
        for (int i = 0; i < array.length; i++){ // loop for para imprimir o array
            System.out.println(array[i]);
        }

    }
    private static void insertionSort(int[] array){ // função de ordenação
        for (int i = 1; i < array.length; i++){ // loop for começando do segundo elemento: i = 1
            int currentValue = array[i]; // atribui o valor atual do elemento a variavel currentValue

            int j = i - 1; // a variavel "j" irá percorrer os elementos. Para ser os anteriores será: i - 1
            while (j >= 0 && array[j] > currentValue){ // se essas condições forem verdadeiras o loop continua
                array[j + 1] = array[j]; // Para os elementos posteriores: j + 1
                j--; // Decrementa para verificar o elemento anterior
            }
            array[j + 1] = currentValue; // insere o currentValue na posição correta do array
        }
    }
}