//Комментарий преподавателю: Я, Рустем Алигожин, удалил репозиторий и создал новый такой же,
//поэтому слетели коммиты мои, по этой причине я перезаливаю весь процесс создания проекта
//Также изначально начинали делать на спринге.

package com.finctonrol.financialcontrol.repositories;

import com.finctonrol.financialcontrol.models.TransactionEntity;


import com.finctonrol.financialcontrol.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findByUserEntity(UserEntity userEntity);

}
