package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.vo.testVo;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("testDao")
public class testDao extends EgovAbstractDAO {
	
	public List<?> selectAll() throws Exception {
		return list("testDao.selectAll");
	}

	public void insertUser(testVo vo) {
		// TODO Auto-generated method stub
		insert("testDao.insertUser");		
	}
	
}
