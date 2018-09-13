package com.test.service;

import java.util.List;

import com.test.vo.testVo;

public interface testService {
	public String addString(String str) throws Exception;
	public List<?> selectAll() throws Exception;
	public void insertUser(testVo vo) throws Exception;
}
