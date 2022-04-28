package com.bnamericas.bnamericas;

import com.bnamericas.bnamericas.api.HolyDayAPI;
import com.bnamericas.bnamericas.model.HolyDay;
import com.bnamericas.bnamericas.service.HolyDayService;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BnamericasApplicationTests {

	@Autowired
	private HolyDayAPI api;

	@Autowired
	private HolyDayService service;

	@Test
	public void test() {
		List<HolyDay> holyDays = api.getHolyDays();
		service.saveAll(holyDays);
		List<HolyDay> holyDaysDB = service.getAll();
		Assertions.assertNotNull(holyDaysDB);
		System.out.println(holyDaysDB);
	}

}
