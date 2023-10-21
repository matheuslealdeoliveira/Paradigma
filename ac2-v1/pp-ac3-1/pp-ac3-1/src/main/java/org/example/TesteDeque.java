
package org.example;

public class TesteDeque {

    public static void main(String[] args) {
        Deque deque = new Deque();

        Paciente p1 = new Paciente(1, "Paciente1", false, "Sintoma1", 40, 55.0);
        System.out.println(p1);

        /* Verifique se a saída do toString acima é
        Paciente{id=1, nome='Paciente1', prioritario=false, sintomas='Sintoma1', idade=40, peso=55.0}
        se não for, ajuste o toString() de Paciente para que fique assim
        */

        deque.inserePaciente(p1);
        deque.inserePaciente(new Paciente(2,"Paciente2", true, "Sintoma2", 40, 55.5));
        deque.inserePaciente(new Paciente(3,"Paciente3", false, "Sintoma3", 40, 55.5));
        deque.inserePaciente(new Paciente(4,"Paciente4", true, "Sintoma4", 40, 55.5));
        deque.inserePaciente(new Paciente(5,"Paciente5", false, "Sintoma5", 40, 55.5));

        System.out.println("\nExibicao do deque:");
        deque.exibeInicioParaFim();

        // print o retorno da remoção do inicio da fila
        // veja se quem saiu foi o primeiro paciente que estava na fila

        // print o retorno da remoção do fim da fila
        // veja se quem saiu foi o último da fila

        // exiba de trás para frente, e verifique se está certo





    }
}

//package org.example;
//
//public class TesteDeque {
//
//    public static void main(String[] args) {
//        Deque deque = new Deque();
//
//        Paciente p1 = new Paciente(1, "Paciente1", false, "Sintoma1", 40, 55.0);
//        Paciente p2 = new Paciente(1, "Paciente2", false, "Sintoma1", 40, 55.0);
//        System.out.println(p1);
//
////        System.out.println(deque.isEmpty());
//
//        deque.insereInicio(p1);
//        deque.insereFim(p2);
//
////        System.out.println(deque.isEmpty());
//
////        deque.removeInicio();
////        deque.removeFim();
////        System.out.println(deque.isEmpty());
//
//        /* Verifique se a saída do toString acima é
//        Paciente{id=1, nome='Paciente1', prioritario=false, sintomas='Sintoma1', idade=40, peso=55.0}
//        se não for, ajuste o toString() de Paciente para que fique assim
//        */
//
////        deque.inserePaciente(p1);
////        deque.inserePaciente(new Paciente(2,"Paciente2", true, "Sintoma2", 40, 55.5));
////        deque.inserePaciente(new Paciente(3,"Paciente3", false, "Sintoma3", 40, 55.5));
////        deque.inserePaciente(new Paciente(4,"Paciente4", true, "Sintoma4", 40, 55.5));
////        deque.inserePaciente(new Paciente(5,"Paciente5", false, "Sintoma5", 40, 55.5));
//
//        System.out.println("\nExibicao do deque:");
//        deque.exibeInicioParaFim();
//        System.out.println("\nExibicao do deque:");
//        deque.exibeFimParaInicio();
//
//        // print o retorno da remoção do inicio da fila
//        // veja se quem saiu foi o primeiro paciente que estava na fila
//
//        // print o retorno da remoção do fim da fila
//        // veja se quem saiu foi o último da fila
//
//        // exiba de trás para frente, e verifique se está certo
//
//
//    }
//}