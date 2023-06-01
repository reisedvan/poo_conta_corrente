package br.com.bancos.service;

import br.com.bancos.domain.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioService {

    private List<Funcionario> lista = new ArrayList();
    Funcionario funcionario;

    public Funcionario CadastrarNovoFuncionario(Funcionario funcionario) {

        funcionario.setId(lista.size());
        lista.add(funcionario);
        return funcionario;

    }

    public Funcionario buscarFuncionarioId(long id) {

        for (Funcionario funcionario : lista) {
            if (funcionario.getId() == id) {

                return funcionario;
            }

        }
        return null;
    }

    public Funcionario buscarFuncionarioDocumento(String documento) {

        for (Funcionario funcionario : lista) {
            if (funcionario.getDocumento().equals(documento)) {

                return funcionario;
            }

        }
        return null;
    }
    
    

}
