package br.com.bancos.service;

import br.com.bancos.domain.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Gerenciador de clientes
public class ClienteService {

    private List<Cliente> lista = new ArrayList();
    private Cliente Cliente;

    public Cliente cadastrarCliente(Cliente cliente) {
        if (cliente.ValidarIdade()) {
            cliente.setId(lista.size());
            lista.add(cliente);
        }
        return cliente;
    }

    public boolean existsByDocument(String documento) {

        return findfByDocument(documento) != null;
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

    public Cliente findfByDocument(String documento) {
        for (Cliente cliente : lista) {
            if (cliente.getDocumento().equals(documento)) {
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

    public Cliente updateCostumer(Cliente atualizadoCliente) {
        for (Cliente cliente : lista) {
            if (cliente.getId() == atualizadoCliente.getId()) {

                cliente.setEndereço(atualizadoCliente.getEndereço());
                cliente.setRendaBruta(atualizadoCliente.getRendaBruta());

            }
            return cliente;
        }
        return null;

    }

}
