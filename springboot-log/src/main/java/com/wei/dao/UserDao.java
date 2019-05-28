package com.wei.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void log() {
        logger.debug("debugger");
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
    }
}
