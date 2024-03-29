package com.codebrain.backendchallenge.resources;

import java.util.List;

import com.codebrain.backendchallenge.domain.Produto;
import com.codebrain.backendchallenge.domain.Venda;
import com.codebrain.backendchallenge.service.ProdutoService;
import com.codebrain.backendchallenge.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins={"http://localhost:3000","https://codebrain-frontend.herokuapp.com"})
public class LojaController {

    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private VendaService vendaService;
    
    @CrossOrigin
    @PostMapping("/novo-produto")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto saveNewProduct(@RequestBody Produto p) {

        return produtoService.saveProduto(p);
    }
    @CrossOrigin
    @GetMapping("/produtos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> getProductsStore() {
        return produtoService.getProdutos();
    }
    @CrossOrigin
    @PostMapping("/nova-venda")
    @ResponseStatus(HttpStatus.CREATED)
    public Venda saveNewSale(@RequestBody Venda venda) {
        return vendaService.saveVenda(venda);
    }
    @CrossOrigin
    @GetMapping("/vendas")
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> getAllSales() {
        return vendaService.getVendas();
    }

}
