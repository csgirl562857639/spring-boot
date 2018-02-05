package com.heihaier.springbootdemo.dozer;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author heihaier@xfuweng.com
 * Date: 05/02/2018
 * Time: 15:49
 */
@Slf4j
public class BeanMapper {

    public static <S, D> D map(S source, Class<D> destinationClass) {
        return MapperEnum.MAPPER.instance().map(source, destinationClass);
    }

    public static void main(String[] args) {
        SourceDemo demo = new SourceDemo();
        demo.setAge(27);
        demo.setName("heihaier");
        demo.setDate(new Date());
        TargetDemo res = BeanMapper.map(demo, TargetDemo.class);
        log.info("res: {}", res);
    }
}
