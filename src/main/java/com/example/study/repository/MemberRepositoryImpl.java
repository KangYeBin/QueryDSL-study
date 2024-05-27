package com.example.study.repository;

import com.example.study.entity.Member;
import com.example.study.entity.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
// QuryDSL용 인터페이스의 구현체는 반드시 이름이 Impl로 끝나야 자동으로 인식되어
// 원본 인터페이스 타입(MemberRepository)의 객체로도 사용 가능하다
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Member> findByName(String name) {
        return queryFactory
                .selectFrom(QMember.member)
                .where(QMember.member.userName.eq(name))
                .fetch();
    }
}
