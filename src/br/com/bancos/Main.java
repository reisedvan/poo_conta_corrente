package br.com.bancos;

import java.util.Scanner;

public class Main {

    Scanner entrada = new Scanner(System.in);
    ContaCorrente gestaoContas = new ContaCorrente();
    int opcao;

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente gestaoContas = new ContaCorrente();

        int opcao;
        int novaOpcao;
        int cpf;
        int aceite;
        System.out.println("o você já é cliente ?\n 1-Sim\n 2-Não ");
        opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                System.out.println(" O que deja fazer?\n "
                        + "1- Sacar\n "
                        + "2- depositar\n "
                        + "3- consultar saldo\n "
                        + "4- consultar limite");
                novaOpcao = entrada.nextInt();

                switch (novaOpcao) {

                    case 1:

                        System.out.println(" Informe seu CPF ?");
                        cpf = entrada.nextInt();
                        if (gestaoContas.ConsularCpf(cpf) != 0) {
                            System.out.println(" Qual valor você deseja sacar ?");
                            float valorSaque = entrada.nextFloat();
                            gestaoContas.sacar(valorSaque);
                        } else {
                            System.out.println("Não foi possivel verificar seu Cpf,"
                                    + "procure uma agencia");
                            menu();
                        }

                        break;

                    case 2:

                        System.out.println(" Informe seu CPF ?");
                        cpf = entrada.nextInt();
                        if (gestaoContas.ConsularCpf(cpf) != 0) {
                            System.out.println(" Qual valor você deseja depositar?");
                            float valorDeposito = entrada.nextFloat();
                            gestaoContas.creditar(valorDeposito);
                        } else {
                            System.out.println("Não foi possivel verificar seu Cpf,"
                                    + "procure uma agencia");
                            menu();
                        }
                        break;

                    case 3:
                        System.out.println(" Informe seu CPF ?");
                        cpf = entrada.nextInt();
                        if (gestaoContas.ConsularCpf(cpf) != 0) {
                            gestaoContas.verificarSaldo();
                        } else {
                            System.out.println("Não foi possivel verificar seu Cpf,"
                                    + "procure uma agencia");
                            menu();
                        }
                    case 4:
                        System.out.println(" Informe seu CPF ?");
                        cpf = entrada.nextInt();
                        if (gestaoContas.ConsularCpf(cpf) != 0) {
                            gestaoContas.verificarLimite();
                        } else {
                            System.out.println("Não foi possivel verificar seu Cpf,"
                                    + "procure uma agencia");
                            menu();
                        }

                }
            case 2:

                System.out.println("Deseja ser cadastrasdo como Cliente\n 1 - sim\n 2- Não ");
                aceite = entrada.nextInt();

                if (aceite != 1) {

                    menu();

                } else {

                    System.out.println("Quantas clientes deseja cadastrar?");
                    int limit = entrada.nextInt();
                    entrada.nextLine();

                    

                }

        }

    }
}

// public static void CadastrarContaCliente() {
//
//        Scanner entrada = new Scanner(System.in);
//        Cliente novoCliente = new Cliente();
//        System.out.println("Insira o nome do Cliente");
//        novoCliente.setNome(entrada.nextLine());
//        entrada.nextLine();
//        System.out.println("Entre com o Sobrenome ");      
//        novoCliente.setSobrenome(entrada.nextLine());
//        entrada.nextLine();
//        System.out.println("entre com o ano de aniversario");
//        novoCliente.setAnoAniversario(entrada.nextInt());
//        System.out.println("Entre com o mes do aniversario");
//        novoCliente.setMesAniversario(entrada.nextInt());
//        System.out.println("Entre com o dia do aniversario");
//        novoCliente.setDiaAniversario(entrada.nextInt());
//        System.out.println("Entre com sexo ");
//        novoCliente.setSexo(entrada.nextLine());
//        entrada.nextLine();
//        System.out.println("Entre com endereço ");
//        novoCliente.setEndereço(entrada.nextLine());
//        entrada.nextLine();
//        System.out.println("Documento CPF ");
//        novoCliente.setDocumento(entrada.nextInt());
//        System.out.println("Insira renda Bruta ");
//        novoCliente.setRendaBruta(entrada.nextFloat());
//
//    }
//
//    public int ConsularCpf(int cpf) {
//        Cliente novoCliente = new Cliente();
//        return novoCliente.getDocumento();
//
//    }