package ru.malkov.MyThirdTestAppSpringBoot.service;

import ru.malkov.MyThirdTestAppSpringBoot.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}