package com.codingfuture.service.impl;

import com.codingfuture.dao.DeptDao;
import com.codingfuture.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public String selectOneDept(String deptNum) {
        return deptDao.selectOneDept(deptNum);
    }
}
