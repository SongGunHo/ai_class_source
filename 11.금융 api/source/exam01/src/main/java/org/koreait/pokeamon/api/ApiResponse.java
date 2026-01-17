package org.koreait.pokeamon.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)// 응답 데이터 와 일치 하지 않는 구조인 경우 무시
public class ApiResponse {

    private int count;
    @JsonAlias("next")
    private String n_ext;
    private String previous;
    private List<UrlItem> result;





}
