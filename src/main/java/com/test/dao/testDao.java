package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("testDao")
public class testDao extends EgovAbstractDAO {
	
	public List<?> selectAll() throws Exception {
		return list("testDao.selectAll");
	}
	
}
