package com.gura.spring.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring.cafe.dto.CafeDto;

@Repository
public class CafeDaoImpl implements CafeDao{

	@Autowired
	private SqlSession session;
	
	
	@Override
	public void insert(CafeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CafeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CafeDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CafeDto> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
