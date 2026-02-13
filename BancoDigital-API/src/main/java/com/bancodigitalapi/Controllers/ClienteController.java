package com.bancodigital-api.controllers;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService cliente;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Conta> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }
}