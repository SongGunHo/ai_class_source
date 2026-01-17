package org.koreait.member.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestJoin {
    @Email(message = "이메일 형식이 아닙니다")
    @NotBlank(message = "이메일 을 입력 하세요")
    private String email;
    @NotBlank(message = "비밀 번호를 입력 하세요")
    private String password;
    @NotBlank(message = "이름을 입력 하세요")
    private String name;
}
