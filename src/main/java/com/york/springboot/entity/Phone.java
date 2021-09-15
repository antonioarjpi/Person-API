package com.york.springboot.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Automaticamente insere os getters e setters
@Builder //Dar padrão de objetos
@AllArgsConstructor //São os construtores
@NoArgsConstructor //São os construtores
public class Phone{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
