package ru.malkov.MyThirdTestAppSpringBoot.service;

import ru.malkov.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.malkov.MyThirdTestAppSpringBoot.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}