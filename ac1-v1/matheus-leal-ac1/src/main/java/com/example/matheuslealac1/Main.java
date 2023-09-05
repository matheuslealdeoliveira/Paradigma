package com.example.matheuslealac1;

public class Main {

    public static void main(String[] args) {

        Repository repository = new Repository();

        repository.addAtEnd('O');
        repository.addAtEnd('i');
        repository.addAtEnd(' ');
        repository.addAtEnd('u');
        repository.addAtEnd('d');
        repository.addAtEnd('o');
        repository.addAtEnd(' ');
        repository.addAtEnd('b');
        repository.addAtEnd('e');
        repository.addAtEnd('m');
        repository.addAtEnd('?');

        repository.addAfterSpace('t');
        repository.addAtIndex(0,'C');

        repository.duplicateValue('i');
        repository.show();

        repository.countWords();

//        Node aux = new Node(' ');
//        repository.countWordsRecursivo(aux, 1);

    }

}
