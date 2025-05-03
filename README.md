# 💱 Conversor de Moeda com Cotação em Tempo Real

Este é um projeto Java que realiza a conversão de moedas com base em cotações reais obtidas pela API [ExchangeRate-API](https://www.exchangerate-api.com/). O usuário pode escolher diferentes pares de moedas e informar um valor a ser convertido.

## ✨ Funcionalidades

- Conversão de:
  - Dólar (USD) → Peso Argentino (ARS)
  - Peso Argentino (ARS) → Dólar (USD)
  - Dólar (USD) → Real Brasileiro (BRL)
  - Real Brasileiro (BRL) → Dólar (USD)
  - Dólar (USD) → Peso Colombiano (COP)
  - Peso Colombiano (COP) → Dólar (USD)
- Utilização da biblioteca **HttpClient** do Java 11+ para chamadas HTTP.
- API de câmbio externa integrada.
- Valores formatados com separador de milhar e duas casas decimais.
- Tratamento básico de erros de conexão.

## 🚀 Tecnologias Utilizadas

- Java 17 (ou superior)
- Maven (opcional)
- API pública de câmbio: ExchangeRate-API
- Gson para leitura e parsing de JSON

## 📦 Estrutura do Projeto


## 🔧 Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/MaylsonDev/conversor-moeda-cotacao.git
cd conversor-moeda-cotacao

javac -d bin src/com/maylson/conversormoeda/*.java
java -cp bin com.maylson.conversormoeda.ConverteMoeda

API Key
Você precisará de uma API Key válida da ExchangeRate-API.
Substitua sua chave no seguinte trecho da ConsultaCotacao.java:


****************************************
Seja bem-vindo/a ao conversor de Moeda =]

1) Dolar => Peso argentino
2) Peso argentino => Dolar
3) Dolar => Real Brasileiro
4) Real Brasileiro => Dolar
5) Dolar => Peso Colombiano
6) Peso Colombiano => Dolar
7) Sair
Escolha uma opção válida:
****************************************

Digite o valor em dólares que deseja converter para pesos argentinos:
>> 10
O valor convertido é: 8.140,23

