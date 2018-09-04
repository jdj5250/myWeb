package com.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.testDao;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("testService")
public class testServiceImpl extends EgovAbstractServiceImpl implements testService {

	@Resource(name="testDao")
	private testDao testDao;
	
	@Override
	public String addString(String str) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("testServiceImpl.addString()");
		return str + "추가됨";
	}

	@Override
	public List<?> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return testDao.selectAll();
	}

}
