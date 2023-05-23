package com.eunyoung.vocab.controller;


import com.eunyoung.vocab.command.VocabVO;
import com.eunyoung.vocab.service.VocabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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


    @RequestMapping(value = "/vocab/vocabRegistForm", method = {RequestMethod.POST})
    public String vocabRegistForm(@RequestParam("vo") VocabVO vo, RedirectAttributes ra) {
        int result = vocabService.vocabRegist(vo);
        Map<String, Object> map = new HashMap<>();
        map.put("vo", vo);
        System.out.println(vo);
        String msg = result == 1 ? "정상 입력되었습니다" : "등록에 실패하였습니다.";
        ra.addFlashAttribute("msg", msg);

        return "redirect:/vocab/note";
    }


}
