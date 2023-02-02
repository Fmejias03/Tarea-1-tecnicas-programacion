// ¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

//codigo de java para el algoritmo de ordenamiento de burbuja de forma recursiva con programacion orientada a objetos

public class OrdenamientoBurbujaRecursivo {
    public static void main(String[] args) {
        int[] arreglo = {5, 3, 2, 4, 7, 1, 0, 6};
        OrdenamientoBurbujaRecursivo burbuja = new OrdenamientoBurbujaRecursivo();
        burbuja.ordenar(arreglo, arreglo.length);
        burbuja.imprimir(arreglo);
    }
    public void ordenar(int[] arreglo, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = temp;
            }
        }
        ordenar(arreglo, n - 1);
    }
    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}

