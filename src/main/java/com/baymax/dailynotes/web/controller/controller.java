package com.baymax.dailynotes.web.controller;

import com.baymax.dailynotes.web.controller.repository.ElectrombileRepository;
import com.baymax.dailynotes.web.entity.Electrombile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author bx
 * @date 9/19/2019 4:12 PM
 */
@RestController
@Slf4j
public class controller {
    private RestTemplate restTemplate;
    private ElectrombileRepository electrombileRepository;
    public controller(RestTemplate restTemplate, ElectrombileRepository electrombileRepository) {
        this.restTemplate = restTemplate;
        this.electrombileRepository = electrombileRepository;
    }

    @Value("${winstar.extrURL}")
    private String extrURL;

    @GetMapping("")
    public String hello() {
        //getOne
        Electrombile el = electrombileRepository.getOne(1L);
        log.info(el.toString());
        Electrombile e2 = new Electrombile();
//        BeanUtils.copyProperties(el, e2);
        e2.setBrandName("baymax");
        e2.setColor("baymax");
        electrombileRepository.save(e2);
        log.info("##################");
        //findById
        Electrombile b1 = electrombileRepository.findById(1L).get();
        Electrombile b2 = new Electrombile();
        BeanUtils.copyProperties(b1,b2);

        b2.setBrandName("baymax1");
        b2.setColor("baymax");
        electrombileRepository.saveAndFlush(b2);

        log.info(b1.toString());
        return b1.toString();
    }

    @GetMapping("getBikeCccInfo/{carNumber}")
    public void getBikeCccInfo(@PathVariable(name = "carNumber") String carNumber) {
        String result = restTemplate.getForObject(extrURL, String.class);
        log.info(carNumber);
        log.info(result);
    }

}
