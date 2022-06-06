package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.server.EbookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController //返回一个字符串

public class EbookController {

    @Value("${test.hello:back}")
    private String testHello;

    @Resource
    private EbookService ebookService;


    @GetMapping("/test/ebook")
    public List<Ebook> list(){
        return ebookService.list();
    }
}


