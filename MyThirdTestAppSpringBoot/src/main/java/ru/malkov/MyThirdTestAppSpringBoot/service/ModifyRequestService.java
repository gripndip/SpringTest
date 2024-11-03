package ru.malkov.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.malkov.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}