package com.meng.study.validation;

import org.springframework.context.annotation.Configuration;

/*
自定义验证错误信息的配置文件位置
但是一直出现乱码问题，果断放弃了。。。。
 */

@Configuration
public class Validationcfg {

    /*@Bean
    public Validator getValidator() {
        Validator validator = Validation.byDefaultProvider().
                configure().
                messageInterpolator(new ResourceBundleMessageInterpolator(new PlatformResourceBundleLocator("ValidationMessages"))).
                buildValidatorFactory().getValidator();
        return validator;
    }*/

}
