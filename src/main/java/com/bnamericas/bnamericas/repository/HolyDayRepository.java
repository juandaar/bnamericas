package com.bnamericas.bnamericas.repository;

import com.bnamericas.bnamericas.model.HolyDay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolyDayRepository extends JpaRepository<HolyDay, Long> {

}
