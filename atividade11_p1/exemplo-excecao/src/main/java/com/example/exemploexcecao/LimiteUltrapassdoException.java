package com.example.exemploexcecao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimiteUltrapassdoException extends Exception {

    String dataHora;

    public LimiteUltrapassdoException(String msg) {
        super(msg);
        dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
