package tech.devinhouse.exerciciossemana09.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.exerciciossemana09.models.Cliente;
import tech.devinhouse.exerciciossemana09.services.ClienteService;

import java.util.List;

@RestController
@RequestMapping(path = "cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> get() {
        return clienteService.get();
    }

    @PostMapping
    public Cliente post(@RequestBody Cliente cliente) throws Exception {
        return clienteService.save(cliente);
    }
    @PutMapping
    public Cliente put(@RequestBody Cliente cliente) throws Exception {
        return clienteService.save(cliente);
    }

    @DeleteMapping
    public boolean delete(Integer id) {
        return clienteService.remove(id);
    }
}
