package com.finctonrol.financialcontrol.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    @ManyToOne
    @JoinColumn(name = "userEntity_id", nullable = false)
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "budgetEntity_id")
    private BudgetEntity budgetEntity;

    @ManyToOne
    @JoinColumn(name = "categoryEntity_id")
    private CategoryEntity categoryEntity;
}
