package ru.malkov.MyThirdTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import ru.malkov.MyThirdTestAppSpringBoot.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Qualifier("ModifyOperationUidResponseService")
public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();
        response.setOperationUid(uuid.toString());

        log.info("modify response: {}", response);

        return response;
    }
}