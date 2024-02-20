package com.finctonrol.financialcontrol.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "budgets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double monthlyBudget;

    @ManyToOne
    @JoinColumn(name = "userEntity_id", nullable = false)
    private UserEntity userEntity;
}