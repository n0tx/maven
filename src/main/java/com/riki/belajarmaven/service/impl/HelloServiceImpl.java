package com.riki.belajarmaven.service.impl;

import com.riki.belajarmaven.domain.Hello;
import com.riki.belajarmaven.repository.HelloRepository;
import com.riki.belajarmaven.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloRepository helloRepository;

    @Override
    public Hello getHello(Long id) {
        return helloRepository.getHelloMessage(id);
    }
}
