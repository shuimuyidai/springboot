package com.shuimu.springboot2.dao;

import com.shuimu.springboot2.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 */
public interface CityDao {
	
	City findById(@Param("id") Long id);

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
    
    List<City> findAllCity();
    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
