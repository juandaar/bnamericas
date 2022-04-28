package com.bnamericas.bnamericas.api;

import java.util.Arrays;
import java.util.List;

import com.bnamericas.bnamericas.model.HolyDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HolyDayAPI {

    private RestTemplate template;

    @Autowired
    public HolyDayAPI(RestTemplate template) {
        this.template = template;
    }

    public List<HolyDay> getHolyDays() {
        HolyDay[] arrayHolyDay = template.getForObject("https://feriados-cl-api.herokuapp.com/feriados",
                HolyDay[].class);
        return Arrays.asList(arrayHolyDay);
    }
}
