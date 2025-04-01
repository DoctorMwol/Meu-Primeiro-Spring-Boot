package com.example.meu_primeiro_spring_boot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.repository.ProdutoRepository;
import com.example.meu_primeiro_spring_boot.exceptions.RecursoNaoEncontradoException;
import com.example.meu_primeiro_spring_boot.model.Produto;

@Service
public class ProdutoServices {

    private final ProdutoRepository produtoRepository;

    public ProdutoServices(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
        .orElseThrow(() -> new RecursoNaoEncontradoException("Produto com id " + id + " não encontrado."));
    }

    public Produto salvaProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        if (!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontradoException("Produto com id " + id + " não encontrado.");
        }
        produtoRepository.deleteById(id);
    }

}
