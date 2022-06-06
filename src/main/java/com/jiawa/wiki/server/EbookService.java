package com.jiawa.wiki.server;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    //写入逻辑
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

}
