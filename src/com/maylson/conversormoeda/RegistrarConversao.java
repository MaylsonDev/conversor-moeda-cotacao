package com.maylson.conversormoeda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistrarConversao {
    private String moedaOrigem;
    private String moedaDestino;
    private double valorOriginal;
    private double valorConvertido;

    public RegistrarConversao(String moedaOrigem, String moedaDestino, double valorOriginal, double valorConvertido) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorConvertido;
    }


    public void registralLogConversao(){
        LocalDateTime horaAtual = LocalDateTime.now();
        DateTimeFormatter horaData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = horaAtual.format(horaData);

        String log = String.format("[%s] Conversão realizada: %.2f %s → %.2f %s",
                dataHoraFormatada,
                 valorOriginal,
                 moedaOrigem,
                 valorConvertido,
                 moedaDestino
                );
        System.out.println(log);

    }
}
