package tech.devinhouse.exerciciossemana09.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.exerciciossemana09.models.Produto;
import tech.devinhouse.exerciciossemana09.repositories.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> get() {
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto) throws Exception {
        List<Produto> listaprodutos = produtoRepository.findAll();
        if (produto.getValorUnitario() < 0 || listaprodutos.toString().contains(produto.getSku())) {
            throw new Exception("Erro: Valor unitário não pode ser menor que 0 e o SKU é um valor único.");
        } else {
            return produtoRepository.save(produto);

        }

    }

    public boolean remove(Integer id) {
        try {
            Optional<Produto> produto = produtoRepository.findById(id);
            if (produto.isEmpty())
                return false;
            produtoRepository.delete(produto.get());
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
