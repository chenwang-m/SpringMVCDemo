package com.codingfuture.mapper;

import com.codingfuture.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    List<Dept> findAll();
    List<Dept> findByID(int deptno);
    int add(@Param("dname") String dname,@Param("loc") String loc);
    int add2(Dept dept);
}
