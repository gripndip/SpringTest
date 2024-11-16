package ru.malkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.malkov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
