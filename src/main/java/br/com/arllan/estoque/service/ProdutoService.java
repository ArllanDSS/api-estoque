package br.com.arllan.estoque.service;

import br.com.arllan.estoque.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProdutoService {

    private final AtomicLong contadorId = new AtomicLong();
    private final List<Produto> produtos = new ArrayList<>();

    public Produto criar(String nome, String descricao, Double preco, Integer quantidadeEstoque) {
        Produto produto = new Produto();

        produto.setId(contadorId.incrementAndGet());
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        produto.setQuantidadeEstoque(quantidadeEstoque);
        produto.setAtivo(true);

        produtos.add(produto);

        return produto;
    }

    public List<Produto> listar() {
        return new ArrayList<>(produtos);
    }
}