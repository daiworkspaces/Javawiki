package com.jiawa.wiki.server;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    //写入逻辑
    public List<Test> list(){
        return testMapper.list();
    }

}
