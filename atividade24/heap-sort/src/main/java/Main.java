import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int v[] = {3, 2, 14, 13, 8, 11, 13, 9, 8, 7, 6, 5, 4};

        heapSort(v);
    }

    public static void insereEmHeap(int m, int v[]) {
        int f = m + 1;
        int p = pai(f);

        while (f > 0 && v[p] < v[f]) {
            int aux = v[p];
            v[p] = v[f];
            v[f] = aux;
            f = p;
            p = pai(f);
        }
    }

    public static void ajustarHeap(int m, int v[]) {
        int f = 1;
        while (f <= m) {
            if (f < m && v[f] < v[f + 1]) {
                f ++;
            }
            int p = pai(f);
            if (v[p] >= v[f]) {
                break;
            } else {
                int aux = v[p];
                v[p] = v[f];
                v[f] = aux;
                f = f * 2 + 1;
            }
        }
    }

    public static void heapSort(int v[]) {
        int m;
        for (m = 0; m < v.length -1; m++) {
            insereEmHeap(m, v);
            System.out.println(Arrays.toString(v));
        }

        System.out.println("VETOR MAX HEAP" + Arrays.toString(v));

        for (m = v.length-1; m >= 0; m--) {
            int aux = v[0];
            v[0] = v[m];
            v[m] = aux;
            System.out.println(Arrays.toString(v));
            ajustarHeap(m-1, v);
            System.out.println(Arrays.toString(v));
        }
    }

    public static int pai(int f) {
        if (f % 2 == 0) {
            return (f - 1) / 2;
        } else {
            return (f - 2) / 2;
        }
    }

}
