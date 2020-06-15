package com.still.demo.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lee
 * @Description TODO
 * @Date 2020/6/15 14:09
 * @Version 1.0
 */
@RestController
@Slf4j
public class AdvisedObj {

    @GetMapping("aspect/{id}")
    public String perform(@PathVariable("#{id}") String id){
        log.info("perform()." + id);
        return id;
    }
}
