## Autores
- Tainan Rocha

## Desafio
### Criando um Banco Digital com Java e Orientação a Objetos

Neste desafio, realizei uma implementação simples de um sistema bancário utilizando conceitos de Programação Orientada a Objetos (OOP) em Java. Ele demonstra a criação de diferentes tipos de contas bancárias (Conta Corrente e Conta Poupança) e operações básicas como depósito, saque e transferência. 

## Estrutura do Projeto 
### O projeto é composto pelos seguintes arquivos:

- `Cliente.java`: Define a classe `Cliente` que possui um nome e uma lista de contas associadas a ele.
- `Conta.java`: Define a classe abstrata `Conta` que serve como base para as classes `ContaCorrente` e `ContaPoupanca`.
- `ContaCorrente.java`: Define a classe `ContaCorrente` que herda da classe `Conta`.
- `ContaPoupanca.java`: Define a classe `ContaPoupanca` que herda da classe `Conta`.
- `Banco.java`: Define a classe `Banco` que gerencia clientes e contas.
- `Main.java`: Contém o método principal que cria instâncias de `Banco`, `Cliente` e `Conta`, e realiza operações bancárias.

## Funcionalidades

### Cliente

A classe `Cliente` possui os seguintes atributos e métodos:

- `nome`: Nome do cliente.
- `conta`: Lista de contas associadas ao cliente.
- `Cliente(String nome)`: Construtor que inicializa o nome do cliente.
- `atribuindoConta(Conta conta)`: Método para adicionar uma conta ao cliente.
- `exibirDadosConta()`: Método para exibir os dados das contas do cliente.

### Conta

A classe `Conta` é uma classe abstrata que define os atributos e métodos comuns para todas as contas:

- `agencia`: Número da agência da conta.
- `numeroConta`: Número da conta.
- `saldo`: Saldo da conta.
- `Conta(int agencia, int numeroConta)`: Construtor protegido que inicializa a agência e o número da conta.
- `getAgencia()`, `getNumeroConta()`, `getSaldo()`: Métodos getters para acessar os atributos da conta.
- `depositar(double valorDeposito)`: Método para depositar um valor na conta.
- `sacar(double valorSaque)`: Método para sacar um valor da conta.
- `transferir(double valorTransferencia, Conta contaDestino)`: Método para transferir um valor para outra conta.
- `exibirExtrato()`: Método para imprimir o saldo da conta.

### ContaCorrente e ContaPoupanca

As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta` e utilizam o construtor da superclasse para inicializar a agência e o número da conta.

### Banco

A classe `Banco` possui os seguintes atributos e métodos:

- `nome`: Nome do banco.
- `contas`: Lista de contas do banco.
- `clientes`: Lista de clientes do banco.
- `Banco(String nome)`: Construtor que inicializa o nome do banco.
- `criarConta(Conta conta, Cliente cliente)`: Método para criar uma conta e associá-la a um cliente.

### Main

A classe `Main` contém o método principal (`main`) que executa o programa, criando instâncias de `Banco`, `Cliente` e `Conta`, e realizando operações bancárias.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests.
