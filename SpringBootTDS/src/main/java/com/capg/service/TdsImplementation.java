package com.capg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.dao.TdsDAO;
import com.capg.dto.TdsMaster;
@Component("Tds1")
@Service
@Transactional
public class TdsImplementation implements Tds {

	@Autowired
	TdsDAO dao;
	@Override
	public TdsMaster getByPid(int pId) {
		// TODO Auto-generated method stub
		return dao.getByPid(pId);	
		
	}

}







