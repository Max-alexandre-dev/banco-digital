package com.bancodigital-api.services;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructo;
import java.util.List;

@Service
@RequiredArgsConstructor
public class clienteService {

    private final clienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscarPorId(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }

}