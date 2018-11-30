package com.shuimu.springboot2.controller;

import com.shuimu.springboot2.model.City;
import com.shuimu.springboot2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author KL
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    /*@RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }*/
    /*@RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCityByID(@RequestParam(value = "id", required = true) Long id) {
    	return cityService.findCityById(id);
    }*/
    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }
    @RequestMapping(value = "/api/cityName/{id}", method = RequestMethod.GET)
    public String findOneCityName(@PathVariable("id") Long id) {
        return cityService.findCityByIdName(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {

        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {

        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {

        cityService.deleteCity(id);
    }

}
