package com.tr.urule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动后访问 http://127.0.0.1:8080/urule 即进入 urule 首页
 * 	Urule 专业版与免费版构建区别：只有引入依赖的不同，其他都相同。
 *
 * @author Amarsoft
 */
@SpringBootApplication
@ImportResource({"classpath:urule-context.xml"})
public class UruleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UruleApplication.class, args);
	}

}