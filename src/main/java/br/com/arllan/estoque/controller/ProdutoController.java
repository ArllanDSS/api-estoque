package br.com.arllan.estoque.controller;

import br.com.arllan.estoque.model.Produto;
import br.com.arllan.estoque.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @PostMapping
    public Produto criar(@Valid @RequestBody Produto produto) {
        return produtoService.criar(
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getQuantidadeEstoque()
        );
    }
}