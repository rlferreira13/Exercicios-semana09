package tech.devinhouse.exerciciossemana09.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.exerciciossemana09.models.Cliente;
import tech.devinhouse.exerciciossemana09.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> get() {
        return clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente) throws Exception {
        List<Cliente> listaclientes = clienteRepository.findAll();
        if (listaclientes.toString().contains(cliente.getCpfCnpj())) {
            throw new Exception("Erro: CPF já cadastrado.");
        } else {
            return clienteRepository.save(cliente);

        }

    }

    public boolean remove(Integer id) {
        try {
            Optional<Cliente> produto = clienteRepository.findById(id);
            if (produto.isEmpty())
                return false;
            clienteRepository.delete(produto.get());
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
