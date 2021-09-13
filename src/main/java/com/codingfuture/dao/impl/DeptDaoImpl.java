package com.codingfuture.dao.impl;

import com.codingfuture.dao.DeptDao;
import com.codingfuture.entity.Dept;
import com.codingfuture.util.JDBCUtils;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Override
    public String selectOneDept(String deptNum) {
//        List<Dept> oneDeptList = new ArrayList<>();
        String deptName = null;
        try (Connection connection = JDBCUtils.getConnection()) {
            String sql = "SELECT a.dpt_name,a.dpt_id FROM ims_department a LEFT JOIN (SELECT ROW_NUMBER() " +
                    "OVER(ORDER BY dpt_id) AS rowNumber,dpt_name FROM ims_department WHERE is_deleted = 0) b " +
                    "ON a.dpt_name = b.dpt_name WHERE a.is_deleted = 0 AND b.rowNumber = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, deptNum);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                deptName = resultSet.getString("dpt_name");
                //String deptId = resultSet.getString("dpt_id");
//                oneDeptList.add(new Dept(deptId, deptName));
            }
        } catch (SQLException e) {
            System.out.println("数据库连接异常" + e.getMessage());
        }
        return deptName;
    }
}
