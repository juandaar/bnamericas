package com.bnamericas.bnamericas.service;

import java.util.List;

import com.bnamericas.bnamericas.model.HolyDay;
import com.bnamericas.bnamericas.repository.HolyDayRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolyDayServiceImpl implements HolyDayService {

    private HolyDayRepository repository;

    @Autowired
    public HolyDayServiceImpl(HolyDayRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveAll(List<HolyDay> holydays) {
        repository.saveAll(holydays);
    }

    @Override
    public List<HolyDay> getAll() {
        return repository.findAll();
    }

}
