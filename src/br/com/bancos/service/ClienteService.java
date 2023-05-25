package br.com.bancos.service;

import br.com.bancos.domain.Cliente;
import java.util.ArrayList;
import java.util.List;

//Gerenciador de clientes
public class ClienteService {

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
   

}
