package com.example.exerciciofilaprioridade;

import java.util.Arrays;

public class HeapSort {

    public void insereEmHeap(int m, Paciente v[]) {
        int f = m + 1;
        int p = pai(f);

        while (f > 0 && v[p].getPrioridade() < v[f].getPrioridade()) {
            Paciente aux = v[p];
            v[p] = v[f];
            v[f] = aux;
            f = p;
            p = pai(f);
        }
    }

    public void ajustarHeap(int m, Paciente v[]) {
        int f = 1;
        while (f <= m) {
            if (f < m && v[f].getPrioridade() < v[f + 1].getPrioridade()) {
                f ++;
            }
            int p = pai(f);
            if (v[p].getPrioridade() >= v[f].getPrioridade()) {
                break;
            } else {
                Paciente aux = v[p];
                v[p] = v[f];
                v[f] = aux;
                f = f * 2 + 1;
            }
        }
    }

    public void heapSort(Paciente v[]) {
        int m;
        for (m = 0; m < v.length -1; m++) {
            insereEmHeap(m, v);
        }

        for (m = v.length-1; m >= 0; m--) {
            Paciente aux = v[0];
            v[0] = v[m];
            v[m] = aux;
            ajustarHeap(m-1, v);
        }
    }

    public int pai(int f) {
        if (f % 2 == 0) {
            return (f - 1) / 2;
        } else {
            return (f - 2) / 2;
        }
    }

}
