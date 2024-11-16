package ru.malkov.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    //Уникальный идентификатор сообщения
    private String uid;
    //Уникальный идентификатор операции
    private String operationUid;
    //Время создания сообщения
    private String systemTime;
    //Код
//    private String code;
    private Codes code;
    //Премия
    private Double annualBonus;
    //Код ошибки
//    private String errorCode;
    private ErrorCodes errorCode;
    //Сообщение об ошибке
//    private String errorMessage;
    private ErrorMessages errorMessage;
}