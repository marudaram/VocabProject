package com.eunyoung.vocab.controller;


import com.eunyoung.vocab.command.VocabVO;
import com.eunyoung.vocab.service.VocabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping("/vocab")
public class VocabController {


    @Autowired
    @Qualifier("vocabService")
    public VocabService vocabService;

    @GetMapping("/note")
    public  String vocab() {
        return "vocab/note";
    }


    @PostMapping("/vocabRegistForm")
    public String vocabRegistForm(VocabVO vo, RedirectAttributes ra) {
        int result = vocabService.vocabRegist(vo);

//        ArrayList<VocabVO> vocabList = new ArrayList<>();

        System.out.println(vo);
        String msg = result == 1 ? "정상 입력되었습니다" : "등록에 실패하였습니다.";
        ra.addFlashAttribute("msg", msg);

        return "redirect:/vocab/note";
    }


}
