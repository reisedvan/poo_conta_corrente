package br.com.bancos.service;

import br.com.bancos.domain.Cliente;
import java.util.ArrayList;
import java.util.List;

//Gerenciador de clientes
public class ClienteService {

    private List<Cliente> lista = new ArrayList();

    public Cliente cadastrarCliente(Cliente cliente) {
        if (cliente.validarIdade()) {
            cliente.setId(lista.size());
            lista.add(cliente);
        }
        return cliente;
    }

    public void listarClientes() {
        for (Cliente cliente : lista) {
            System.out.println("Nome: " + cliente.getNome() + " Id: " + cliente.getId());
        }
    }

}
