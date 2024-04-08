package com.message.message.controller;

import java.util.Locale;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

@SpringBootTest
public class MessageControllerTest {

    @Autowired
    MessageSource messageSource;

    @Test
    void helloMessage() {
        String defaultMessage = messageSource.getMessage("hello", null, null);
        Assertions.assertThat(defaultMessage).isEqualTo("안녕");

        String enMessage = messageSource.getMessage("hello", null, Locale.ENGLISH);
        Assertions.assertThat(enMessage).isEqualTo("hello!");

        String argMessage = messageSource.getMessage("hello.name", new Object[]{"Spring!"}, Locale.ENGLISH);
        Assertions.assertThat(argMessage).isEqualTo("hello! Spring!");
    }

}
