package com.maylson.conversormoeda;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverteMoeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat valorAredondado = new DecimalFormat("#,###.00");
        ConsultaCotacao consulta = new ConsultaCotacao();
        String respostaUsuario = "";

        try{
            while(!respostaUsuario.equalsIgnoreCase("sair")){
                System.out.println("****************************************");
                System.out.println("Seja bem-vindo/a ao conversor de Moeda =]");
                System.out.println();
                System.out.println("1) Dolar ==>> Peso argentino\n2) Peso argentino =>> Dolar\n3) Dolar ==>> Real Brasileiro\n4) Real Brasileiro =>> Dolar\n5) Dolar ==>> Peso Colombiano\n6) Peso Colombiano =>> Dolar\n7) Sair\nEscolha uma opção válida:\n************************************");

                respostaUsuario = leitor.nextLine();
                if(respostaUsuario.equalsIgnoreCase("7")){
                    break;
                }
                if (respostaUsuario.equalsIgnoreCase("1")){
                    System.out.println("Digite o valor em dólares que deseja converter para pesos argentinos:");
                    double dolar = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double pesoArgentino = cotacaoMoeda.conversionRates().get("ARS");
                    double valorConvertido = dolar * pesoArgentino;

                    RegistraConversao log = new RegistraConversao("USD","ARS",dolar,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
                if (respostaUsuario.equalsIgnoreCase("2")){
                    System.out.println("Digite o valor em Peso Argentino que deseja converter em Dolares:");
                    double pesoArgentinoInformado = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double pesoArgentino = cotacaoMoeda.conversionRates().get("ARS");
                    double valorConvertido = pesoArgentinoInformado / pesoArgentino;

                    RegistraConversao log = new RegistraConversao("USD","ARS",pesoArgentinoInformado,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
                if (respostaUsuario.equalsIgnoreCase("3")){
                    System.out.println("Digite o valor em Dolar que deseja converter em Reais:");
                    double valorDolar = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double real = cotacaoMoeda.conversionRates().get("BRL");
                    double valorConvertido = valorDolar * real;

                    RegistraConversao log = new RegistraConversao("USD","BRL",valorDolar,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
                if (respostaUsuario.equalsIgnoreCase("4")){
                    System.out.println("Digite o valor em Real que deseja converter em Dolar:");
                    double valorReal = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double real = cotacaoMoeda.conversionRates().get("BRL");
                    double valorConvertido = valorReal / real;

                    RegistraConversao log = new RegistraConversao("USD","BRL",valorReal,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
                if (respostaUsuario.equalsIgnoreCase("5")){
                    System.out.println("Digite o valor em Dolar que deseja converter em Peso Colombiano:");
                    double valorDolar = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double pesoColombiano = cotacaoMoeda.conversionRates().get("COP");
                    double valorConvertido = valorDolar * pesoColombiano;

                    RegistraConversao log = new RegistraConversao("USD","COP",valorDolar,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
                if (respostaUsuario.equalsIgnoreCase("6")){
                    System.out.println("Digite o valor em PesoColombiano que deseja converter em Dolar:");
                    double valorPesoColombiano = leitor.nextDouble();
                    leitor.nextLine();
                    var cotacaoMoeda = consulta.buscaCotacao("USD");
                    double pesoColombiano = cotacaoMoeda.conversionRates().get("COP");
                    double valorConvertido = valorPesoColombiano / pesoColombiano;

                    RegistraConversao log = new RegistraConversao("USD","COP",valorPesoColombiano,valorConvertido);
                    System.out.println("O valor convertido é: " + valorAredondado.format(valorConvertido));
                    log.registraLogConversao();
                }
            }
        }catch (ErrorCotacaoMoeda e) {
            System.out.println("Ocorreu um erro na consulta de cotação da moeda" + e.getMessage());
        }

    }
}
