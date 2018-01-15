package com.wan

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by zhuowan on 2018/1/12 15:02.
 * Description:
 */
@CompileStatic
@SpringBootApplication
class SecondApplication {

    static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args)
    }

}
