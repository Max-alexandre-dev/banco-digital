package com.bancodigital-api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Contas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titular;
    private Double saldo;
}