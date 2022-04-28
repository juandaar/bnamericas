package com.bnamericas.bnamericas.service;

import java.util.List;

import com.bnamericas.bnamericas.model.HolyDay;

public interface HolyDayService {

    void saveAll(List<HolyDay> holydays);

    List<HolyDay> getAll();
}
