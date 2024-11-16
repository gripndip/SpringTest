package ru.malkov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.malkov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class UnsupportedCodeValidation {
    public void Valid(int uid) throws UnsupportedCodeException {
        if (uid == 123) {
            throw new UnsupportedCodeException();
        }
    }
}