package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    
    // JPA 아님, JpaRepository 상속 받지 않음
    List<Member> findByName(String name);
}
