package com.eunyoung.vocab.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VocabVO {
    private int vocab_num;
    private String user_id;
    private String vocab_kor;
    private String vocab_eng;
}


