package com.kbo.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PostCreate {

    @NotBlank(message = "타이틀을 입력해주세요.") // RequestBody annotaion에 달은 값에 대한 검증 진행
    private String title;

    @NotBlank(message = "콘텐츠를 입력해주세요.")
    private String content;

}
