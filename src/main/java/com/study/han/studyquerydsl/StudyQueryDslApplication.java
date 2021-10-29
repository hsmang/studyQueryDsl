package com.study.han.studyquerydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class StudyQueryDslApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyQueryDslApplication.class, args);
    }

    /**
     * JPAQueryFactory 주입방법 중 하나
     * @param em
     * @return
     */
    @Bean
    JPAQueryFactory jpaQueryFactory(EntityManager em){
        return new JPAQueryFactory(em);
    }
}
