package com.example.demo.question;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository를 상속하도록 수정
public interface QuestionRepository extends JpaRepository<Question, Integer> {
 // JpaRepository<엔티티 이름, 해당 엔티티의 ID 필드 타입>
}