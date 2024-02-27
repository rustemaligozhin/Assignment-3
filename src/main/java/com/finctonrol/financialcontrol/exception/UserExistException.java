//Комментарий преподавателю: Я, Рустем Алигожин, удалил репозиторий и создал новый такой же,
//поэтому слетели коммиты мои, по этой причине я перезаливаю весь процесс создания проекта
//Также изначально начинали делать на спринге.

package com.finctonrol.financialcontrol.exception;

public class UserExistException extends Exception{
    public UserExistException(String failure){
        super(failure);
    }
}
