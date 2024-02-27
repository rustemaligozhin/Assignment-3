//Комментарий преподавателю: Я, Рустем Алигожин, удалил репозиторий и создал новый такой же,
//поэтому слетели коммиты мои, по этой причине я перезаливаю весь процесс создания проекта
//Также изначально начинали делать на спринге.

package com.finctonrol.financialcontrol.controllers;

import com.finctonrol.financialcontrol.models.TransactionEntity;
import com.finctonrol.financialcontrol.services.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity addTransaction(@Valid @RequestBody TransactionEntity transaction){
        try{
            transactionService.addTransaction(transaction);
            return ResponseEntity.ok("Transaction added");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Failed to create transaction: " + e.getMessage());
        }


    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        try {
            transactionService.deleteTransaction(id);
            return ResponseEntity.ok("Transaction deleted");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Failed to delete Transaction" + e.getMessage());
        }
    }
}
