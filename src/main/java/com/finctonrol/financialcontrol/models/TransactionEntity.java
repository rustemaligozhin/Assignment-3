//Комментарий преподавателю: Я, Рустем Алигожин, удалил репозиторий и создал новый такой же,
//поэтому слетели коммиты мои, по этой причине я перезаливаю весь процесс создания проекта
//Также изначально начинали делать на спринге.

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

}
