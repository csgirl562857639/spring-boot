package com.heihaier.springbootdemo.dozer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

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

    public static <S, D> List<D> mapList(List<S> sourceList, Class<D> destinationClass) {
        return sourceList.stream()
                .filter(Objects::nonNull)
                .map(source -> map(source, destinationClass))
                .collect(toList());
    }

    public static void main(String[] args) {
        SourceDemo demo = new SourceDemo();
        demo.setAge(27);
        demo.setName("heihaier");
        demo.setDate(new Date());
        TargetDemo res = BeanMapper.map(demo, TargetDemo.class);
        log.info("res: {}", JSON.toJSONString(res, Boolean.TRUE));
    }
}
