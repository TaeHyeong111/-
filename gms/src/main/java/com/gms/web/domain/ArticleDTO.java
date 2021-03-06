package com.gms.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
/*Lazy는 Context가 필요할때만 만든다. 로딩시간단축*/
@Data @Lazy @Component
public class ArticleDTO {
	private String title,content,writer,regdate,viewcnt;
}
