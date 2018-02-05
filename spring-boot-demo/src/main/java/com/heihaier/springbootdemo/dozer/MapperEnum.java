package com.heihaier.springbootdemo.dozer;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 15:50
 */
public enum MapperEnum {

    MAPPER;

    MapperEnum() {
        this.mapper = new DozerBeanMapper();
    }

    private Mapper mapper;

    public Mapper instance() {
        return mapper;
    }
}
