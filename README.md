📱 Projeto de Automação – Calculadora Android com Appium

Este projeto contém a automação de testes funcionais na Calculadora nativa do Android utilizando Appium, Java, JUnit 5 e Page Object Model (POM).

🚀 Tecnologias utilizadas

Java 17

JUnit 5

Maven

Selenium WebDriver

Appium Java Client

Android Studio
 (para gerenciar o emulador Android)

Appium Inspector
 (para inspecionar elementos da calculadora)


🛠️ Estrutura do projeto
calculadora-appium/
 ├── src/test/java/
 │    ├── pages/
 │    │     └── CalculadoraPage.java   # Page Object com métodos das operações
 │    ├── tests/
 │    │     └── CalculadoraTest.java   # Classe de testes com JUnit
 │    └── utils/
 │          └── DriverFactory.java     # Configuração do Appium Driver
 ├── pom.xml                           # Dependências Maven
 └── README.md                         # Documentação do projeto

⚙️ Pré-requisitos

Ter o Java 17+ instalado

Ter o Maven instalado

Ter o Node.js e Appium instalados globalmente

npm install -g appium


Ter um emulador Android configurado no Android Studio (ou usar um dispositivo físico)

Iniciar o Appium Server:

appium

▶️ Como rodar os testes

Inicie o emulador Android.

Abra o Appium Server.

No terminal, dentro da pasta do projeto, execute:

mvn test


Para rodar apenas uma classe específica:

mvn -Dtest=CalculadoraTest test


Para rodar apenas um teste específico:

mvn -Dtest=CalculadoraTest#deveCalcularPotenciaDe2ElevadoA3 test

✅ Funcionalidades testadas

Divisão (200 ÷ 10 = 20)

Raiz quadrada (√25 = 5)

Potência (2³ = 8)

Soma de três números (5 + 3 + 4 = 12)

Percentual (50 % 10 = 5)



Evidência (vídeo demonstrativo)

Você pode conferir a execução dos testes no vídeo gravado:

Veja a evidência aqui
https://www.loom.com/share/614fedd36ec24886a713de0ef84bb59d?sid=75313181-ccbb-4a39-b7c7-2f4c25ac8fdc

Autor

Desenvolvido por Thamires Santos



