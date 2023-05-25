package br.com.bancos.service;

import br.com.bancos.domain.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Gerenciador de clientes
public class ClienteService {

    Scanner entrada = new Scanner(System.in);

    private List<Cliente> lista = new ArrayList();
    private Cliente Cliente;

    public Cliente cadastrarCliente(Cliente cliente) {
        if (cliente.validarIdade()) {
            cliente.setId(lista.size());
            lista.add(cliente);
        }
        return cliente;
    }

    public void listarClientes() {
        for (Cliente cliente : lista) {
            System.out.println(" Id: " + cliente.getId() + "  Nome: " + cliente.getNome() + "  Limite = " + cliente.consultarLimite());
        }
    }

    public Cliente findfById(long id) {
        for (Cliente cliente : lista) {
            if (cliente.getId() == id) {
                return cliente;

            }
        }
        return null;
    }

    public boolean deleteClienteId(long id) {
        for (Cliente cliente : lista) {
            if (cliente.getId() == id) {
                lista.remove(cliente);
                System.out.println("Cliente deletado com sucesso");
                return true;
            }
        }
        System.out.print(" Cliente não existe\n");
        return false;
    }

    public Cliente findCostumerLimit() {
        for (Cliente cliente : lista) {
            if (cliente.consultarLimite() >= 0) {
                lista.add(cliente);

            }
            return cliente;
        }
        return null;

    }

    public Cliente updateCostumer(long id) {
        for (Cliente cliente : lista) {
            if (cliente.getId() == id) {

                System.out.println("Insira o nome do Cliente");
                String nome = entrada.nextLine();
                cliente.setNome(nome);
                System.out.println("Entre com o Sobrenome ");
                String sobrenome = entrada.nextLine();
                cliente.setSobrenome(sobrenome);
                System.out.println("Entre com o endereço ");
                String endereco = entrada.nextLine();
                cliente.setEndereço(endereco);
                System.out.println("Entre com o ano de aniversario ");
                int anoAniversario = entrada.nextInt();
                entrada.nextLine();
                cliente.setAnoAniversario(anoAniversario);
                System.out.println("Entre com o mês do Aniversario ");
                int mesAniversario = entrada.nextInt();
                entrada.nextLine();
                cliente.setMesAniversario(mesAniversario);
                System.out.println("Entre com o dia de aniversario ");
                int diaAniversario = entrada.nextInt();
                entrada.nextLine();
                cliente.setDiaAniversario(diaAniversario);
                System.out.println("Qual o sexo do Cliente");
                String sexo = entrada.nextLine();
                cliente.setSexo(sexo);
                System.out.println("Insira o CPF do Cliente");
                String documento = entrada.nextLine();
                cliente.setDocumento(documento);
                System.out.println("Insira a renda Bruta do Cliente");
                float rendaBruta = entrada.nextFloat();
                entrada.nextLine();
                cliente.setRendaBruta(rendaBruta);
                lista.add(cliente);

            }
            return cliente;
        }
        return null;

    }

}
