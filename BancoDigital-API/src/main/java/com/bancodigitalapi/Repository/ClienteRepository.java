package com.bancodigital-api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bancodigital-api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, int>{
}