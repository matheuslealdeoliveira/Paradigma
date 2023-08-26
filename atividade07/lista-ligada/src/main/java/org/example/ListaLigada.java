package org.example;

public class ListaLigada {

    // Atributos
    private Node head;              // nó cabeça da lista

    // Construtor
    public ListaLigada() {
        head = new Node(0);     // cria o nó head
    }

    // Métodos

    /* Método insereNode - recebe o valor que será o info do novo nó
       Insere o novo nó logo após o head
     */
    public void insereNode(int valor) {
        Node novo = new Node(valor);    // cria um novo nó com info igual a valor
        novo.setNext(head.getNext());   // nó novo passa a apontar para o nó que era o 1o da lista
        head.setNext(novo);             // head passa a apontar para o nó novo (que se torna o 1o da lista)
    }

    /* Método exibe - percorre a lista, exibindo os infos dos nós
     */
    public void exibe()
    {
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null (enquanto não acabou a lista)
            System.out.println(atual.getInfo());    // exibe o info do atual
            atual = atual.getNext();                // faz atual apontar para o próximo do atual
        }
    }

    /* Método buscaNode - recebe o valor que será pesquisado na lista
       Retorna o endereço do nó, caso encontre o valor ou null, caso não encontre
     */
    public Node buscaNode(int valor) {
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null
            if (atual.getInfo() == valor) {     // se info do atual é o valor procurado
                return atual;                   // então retorna atual (encontreou o nó)
            }
            atual = atual.getNext();            // senão faz atual apontar para o próximo nó
        }
        return null;                        // retorna null (porque percorreu a lista toda e não encontrou o valor)
    }

    /* Método removeNode - recebe o valor que será removido da lista
       Retorna true se conseguiu remover ou false caso contrário
     */
    public Boolean removeNode(int valor) {
        Node ant = head;                    // ant começa valendo head (aponta para o nó anterior ao atual)
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null
            if (atual.getInfo() == valor) {     // se info do atual é o valor procurado
                ant.setNext(atual.getNext());   // então faz ant apontar para o próximo nó do atual
                return true;                    //       e retorna true
            }
            ant = atual;                        // senão "avança" ant
            atual = atual.getNext();            //        e "avança" atual
        }
        return false;                       // retorna false (pq percorreu a lista toda e não encontrou o valor)
    }

    /* Método getTamanho - percorre a lista, calculando o seu tamanho
     */
    public int getTamanho() {
        Node atual = head.getNext();    // atual aponta para o 1o nó da lista
        int tam = 0;                    // tam é inicializado com zero
        while (atual != null) {         // enquanto atual é diferente de null (enquanto não acabou a lista)
            tam++;                      //   incrementa tam
            atual = atual.getNext();    //    e "avança" atual
        }
        return tam;                     // retorna tam
    }

    public void inserirAposPrimeiroImpar(int valor) {
        Node ant = head;
        Node atual = head.getNext();
        boolean inseriu = false;
        while (atual != null) {
            if (atual.getInfo() %2 != 0) {
                Node novo = new Node(valor);
                novo.setNext(atual.getNext());
                atual.setNext(novo);
                inseriu = true;
                break;
            } else {
                ant = atual;
                atual = atual.getNext();
            }
        }
        if (!inseriu) {
            insereNode(valor);
        }

        exibe();
    }

    public int getElemento(int indice) {
        Node atual = head.getNext();
        int contador = 0;
        if (indice < 0) {
            System.out.println("valor inválido");
            return -1;
        }
        while (atual != null) {
            if (contador == indice) {
                return atual.getInfo();
            }
            contador ++;
            atual = atual.getNext();
        }
        return -1;
    }

    public boolean removeOcorrencias(int valor) {
        Node ant = head;
        Node atual = head.getNext();
        boolean existe = false;

        while (atual != null) {
            if (atual.getInfo() == valor) {
                removeNode(valor);
                existe = true;
            }
            ant = atual;
            atual = atual.getNext();
        }

        return existe;
    }

    public void arrayToList(int[] vetor) {
        Node atual = head.getNext();
        Node ant = head;
        if (atual != null) {
            System.out.println("Operação inválida");
        } else {
            for (int i = 0; i < vetor.length; i++) {
                Node novo = new Node(vetor[i]);
                novo.setNext(head.getNext());
                head.setNext(novo);
            }
        }
    }

}
