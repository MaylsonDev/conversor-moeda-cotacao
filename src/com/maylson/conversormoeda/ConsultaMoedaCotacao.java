package com.maylson.conversormoeda;
import java.util.Map;

public record ConsultaMoedaCotacao(String results, String baseCode, Map<String,Double> conversionRates) {


}
