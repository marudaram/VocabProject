package com.eunyoung.vocab.service;

import com.eunyoung.vocab.command.VocabVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vocabService")
public class VocabServiceImpl implements VocabService{

    @Autowired
    private VocabMapper vocabMapper;

    @Override
    public int vocabRegist(VocabVO vo) {
        int result = vocabMapper.vocabRegist(vo);

        return result; //성공시 1, 실패시 0
    }
}
