package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capg.dto.TdsMaster;

@Component("dao")
@Repository
@ComponentScan("com")
public class TdsDAOImplementation implements TdsDAO{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public TdsMaster getByPid(int pId) {
		// TODO Auto-generated method stub
		TdsMaster tdsMaster=entityManager.find(TdsMaster.class, pId);
		return tdsMaster;
	}

}









	

