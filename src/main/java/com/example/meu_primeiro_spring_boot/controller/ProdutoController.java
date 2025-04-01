package com.example.meu_primeiro_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_spring_boot.services.ProdutoServices;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.meu_primeiro_spring_boot.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoServices produtoServices;

    public ProdutoController(ProdutoServices produtoServices){
        this.produtoServices = produtoServices;
    }

    @GetMapping()
    public List<Produto> listarProdutos() {
        return produtoServices.listarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProduto(@PathVariable Long id) {
        Produto produto = produtoServices.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping()
    public Produto criaProduto(@RequestBody Produto produto) {
        return produtoServices.salvaProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoServices.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
    
}
