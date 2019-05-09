package io.springpractice.classic;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: yzz
 * Date: 2019-05-09
 */
@ComponentScan
@MapperScan(basePackageClasses = AppBoot.class, annotationClass = Mapper.class)
public class AppBoot {
}
