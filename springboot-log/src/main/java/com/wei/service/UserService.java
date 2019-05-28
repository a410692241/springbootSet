package com.wei.service;

import com.sun.javafx.css.converters.ColorConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void log() {
        logger.debug("debugger");
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
    }
}
