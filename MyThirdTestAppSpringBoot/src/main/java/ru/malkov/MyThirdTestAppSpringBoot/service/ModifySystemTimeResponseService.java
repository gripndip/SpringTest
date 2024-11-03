package ru.malkov.MyThirdTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import ru.malkov.MyThirdTestAppSpringBoot.model.Response;
import ru.malkov.MyThirdTestAppSpringBoot.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.mikov.MyThirdTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        DateTimeUtil DateTimeUtil = null;
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        log.info("modify response: {}", response);

        return response;
    }
}