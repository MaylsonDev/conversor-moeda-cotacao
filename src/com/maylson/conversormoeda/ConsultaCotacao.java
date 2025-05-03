package com.maylson.conversormoeda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotacao {

    public ConsultaMoedaCotacao buscaCotacao(String moeda) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        String cotacaoDolar = "https://v6.exchangerate-api.com/v6/0bd595ec8ee84b92ce2006a7/latest/"+moeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(cotacaoDolar))
                .build();
        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        ConsultaMoedaCotacao consulta = gson.fromJson(json, ConsultaMoedaCotacao.class);
        return  consulta;
    }

}
