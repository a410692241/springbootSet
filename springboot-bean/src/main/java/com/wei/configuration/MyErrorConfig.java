package com.wei.configuration;

import com.wei.bo.UserBO;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 运用于异常处理的视图控制类
 * 根据捕获不同的异常进而跳转到不同的页面
 *
 * @author user
 */

@ControllerAdvice
@ResponseBody
public class MyErrorConfig implements ErrorController {

    @Override
    public String getErrorPath() {
        return "error";
    }


    @ExceptionHandler(ArithmeticException.class)
    public UserBO doHandleError() {
        UserBO userBO = new UserBO();
        userBO.setName("请不要除1");
        return userBO;
    }

    @ExceptionHandler(NullPointerException.class)
    public UserBO handleIllegalParamException(NullPointerException e) {
        String tips = "参数不合法";
        UserBO userBO = new UserBO();
        userBO.setName(tips);
        return userBO;
    }

}
