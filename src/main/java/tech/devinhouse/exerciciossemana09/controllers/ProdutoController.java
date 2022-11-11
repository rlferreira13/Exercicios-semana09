package tech.devinhouse.exerciciossemana09.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.exerciciossemana09.models.Produto;
import tech.devinhouse.exerciciossemana09.services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(path = "produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> get() {
        return produtoService.get();
    }

    @PostMapping
    public Produto post(@RequestBody Produto produto) throws Exception {
        return produtoService.save(produto);
    }
    @PutMapping
    public Produto put(@RequestBody Produto produto) throws Exception {
        return produtoService.save(produto);
    }
    @DeleteMapping
    public boolean delete(Integer id) {
        return produtoService.remove(id);
    }
}
