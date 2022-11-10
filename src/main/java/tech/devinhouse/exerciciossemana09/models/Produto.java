package tech.devinhouse.exerciciossemana09.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Boolean ativo;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false, name = "valor_unitario")
    private double valorUnitario;


}
