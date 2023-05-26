package br.com.bancos.main;

import br.com.bancos.domain.Cliente;
import br.com.bancos.service.ClienteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    private static ClienteService clienteService = new ClienteService();

    public static void main(String[] args) {
//        menu();
        Cliente cliente = new Cliente();
        clienteService.cadastrarCliente(new Cliente("Edvan1", "Reis1", "Rua A", 1999, 12, 13, "M", "ABC1231", 1000));
        clienteService.cadastrarCliente(new Cliente("Edvan2", "Reis2", "Rua A", 1999, 12, 13, "M", "ABC1232", 1000));
        clienteService.cadastrarCliente(new Cliente("Edvan3", "Reis3", "Rua A", 1999, 12, 13, "M", "ABC1233", 1000));
        clienteService.cadastrarCliente(new Cliente("Edvan4", "Reis4", "Rua A", 1999, 12, 13, "M", "ABC1234", 1000));
        clienteService.cadastrarCliente(new Cliente("Edvan5", "Reis5", "Rua A", 1999, 12, 13, "M", "ABC1235", 1000));

        cliente = clienteService.findfByDocument("ABC1231");
        if (cliente == null) {
            System.out.println("Cliente não encontrado");
        } else {
            System.out.println(" Nome: " + cliente.getNome() + " Sobrenome: " + cliente.getSobrenome());
        }

        //clienteService.deleteClienteId(cliente.getId());
        //clienteService.updateCostumer();
        //clienteService.findCostumerLimit().getNome();
        clienteService.listarClientes();

        updateCustomer();

        clienteService.listarClientes();
    }

    public static void updateCustomer() {

        System.out.println("Insira o CPF do Cliente");
        String documento = entrada.nextLine();
        if (clienteService.existsByDocument(documento)) {
            long id = clienteService.findfByDocument(documento).getId();

            System.out.println("Entre com o endereço ");
            String endereco = entrada.nextLine();
            System.out.println("Insira a renda Bruta do Cliente");
            float rendaBruta = entrada.nextFloat();
            entrada.nextLine();

            Cliente cliente = new Cliente(endereco, rendaBruta);

            cliente.setId(id);

            clienteService.updateCostumer(cliente);

        } else {
            System.err.println("Cliente não encontrado");

        }
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("Quantos clientes Você seja cadastrar ?");
        int quantidadeCliente = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < quantidadeCliente;) {

            System.out.println("Insira o nome do Cliente");
            String nome = entrada.nextLine();
            System.out.println("Entre com o Sobrenome ");
            String sobrenome = entrada.nextLine();
            System.out.println("Entre com o endereço ");
            String endereco = entrada.nextLine();
            System.out.println("Entre com o ano de aniversario ");
            int anoAniversario = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Entre com o mês do Aniversario ");
            int mesAniversario = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Entre com o dia de aniversario ");
            int diaAniversario = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Qual o sexo do Cliente");
            String sexo = entrada.nextLine();
            System.out.println("Insira o CPF do Cliente");
            String documento = entrada.nextLine();
            System.out.println("Insira a renda Bruta do Cliente");
            float rendaBruta = entrada.nextFloat();
            entrada.nextLine();

            Cliente cliente = new Cliente(
                    nome,
                    sobrenome,
                    endereco,
                    anoAniversario,
                    mesAniversario,
                    diaAniversario,
                    sexo,
                    documento,
                    rendaBruta);

            clienteService.cadastrarCliente(cliente);

            i++;

            if (i == quantidadeCliente) {
                System.out.println("Deseja cadastrar novo Cliente 1 - sim e 2 - não");
                opcao = entrada.nextInt();

                if (opcao == 1) {
                    i--;
                }

            }

        }
        clienteService.listarClientes();
    }
}

//       switch (opcao) {
//
//            case 1:
//                System.out.println(" O que deja fazer?\n "
//                        + "1- Sacar\n "
//                        + "2- depositar\n "
//                        + "3- consultar saldo\n "
//                        + "4- consultar limite");
//                novaOpcao = entrada.nextInt();
//
//                switch (novaOpcao) {
//
//                    case 1:
//
//                        System.out.println(" Informe seu CPF ?");
//                        cpf = entrada.nextInt();
//                        if (gestaoContas.ConsularCpf(cpf) != 0) {
//                            System.out.println(" Qual valor você deseja sacar ?");
//                            float valorSaque = entrada.nextFloat();
//                            gestaoContas.sacar(valorSaque);
//                        } else {
//                            System.out.println("Não foi possivel verificar seu Cpf,"
//                                    + "procure uma agencia");
//                            menu();
//                        }
//
//                        break;
//
//                    case 2:
//
//                        System.out.println(" Informe seu CPF ?");
//                        cpf = entrada.nextInt();
//                        if (gestaoContas.ConsularCpf(cpf) != 0) {
//                            System.out.println(" Qual valor você deseja depositar?");
//                            float valorDeposito = entrada.nextFloat();
//                            gestaoContas.creditar(valorDeposito);
//                        } else {
//                            System.out.println("Não foi possivel verificar seu Cpf,"
//                                    + "procure uma agencia");
//                            menu();
//                        }
//                        break;
//
//                    case 3:
//                        System.out.println(" Informe seu CPF ?");
//                        cpf = entrada.nextInt();
//                        if (gestaoContas.ConsularCpf(cpf) != 0) {
//                            gestaoContas.verificarSaldo();
//                        } else {
//                            System.out.println("Não foi possivel verificar seu Cpf,"
//                                    + "procure uma agencia");
//                            menu();
//                        }
//                    case 4:
//                        System.out.println(" Informe seu CPF ?");
//                        cpf = entrada.nextInt();
//                        if (gestaoContas.ConsularCpf(cpf) != 0) {
//                            gestaoContas.verificarLimite();
//                        } else {
//                            System.out.println("Não foi possivel verificar seu Cpf,"
//                                    + "procure uma agencia");
//                            menu();
//                        }
//
//                }
//            case 2:
//
//                System.out.println("Deseja ser cadastrasdo como Cliente\n 1 - sim\n 2- Não ");
//                aceite = entrada.nextInt();
//
//                if (aceite != 1) {
//
//                    menu();
//
//                } else {
//
//                    System.out.println("Quantas clientes deseja cadastrar?");
//                    int limit = entrada.nextInt();
//                    entrada.nextLine();
//
//                    
//
//                }
//
//        }
//
//    }
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
