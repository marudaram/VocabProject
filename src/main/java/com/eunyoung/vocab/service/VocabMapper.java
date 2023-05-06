package com.eunyoung.vocab.service;

import com.eunyoung.vocab.command.VocabVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VocabMapper {

    public int vocabRegist(VocabVO vo);
}
