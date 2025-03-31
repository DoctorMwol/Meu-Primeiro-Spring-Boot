package com.example.meu_primeiro_spring_boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.repository.ProdutoRepository;
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

    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto salvaProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
