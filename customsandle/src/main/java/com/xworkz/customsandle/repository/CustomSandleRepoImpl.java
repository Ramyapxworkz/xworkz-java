package com.xworkz.customsandle.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.customsandle.constants.OrderStatus;
import com.xworkz.customsandle.entity.CustomEntity;

public class CustomSandleRepoImpl implements CustomSandleRepo{
	 List<CustomEntity> read;
	@Override
	public boolean onsave(CustomEntity entity) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			
			entityManager.persist(entity);
			entityTransaction.commit();
		}catch(PersistenceException e){
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return false;
	}

	@Override
	public List<CustomEntity> read() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readAll");
			read=query.getResultList();
			
			entityTransaction.commit();
			
		}catch(PersistenceException e){
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return read;
	}

	@Override
	public boolean update(int id, CustomEntity entity) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			CustomEntity entity1=entityManager.find(CustomEntity.class, id);
			entity1.setUserName(entity.getUserName());
			entity1.setEmail(entity.getEmail());
			entity1.setNumber(entity.getNumber());
			entity1.setLength(entity.getLength());
			entity1.setSizeOfSandle(entity.getSizeOfSandle());
			entity1.setWidth(entity.getWidth());
			entity1.setDesign(entity.getDesign());
   
			entityManager.merge(entity1);
			
			entityTransaction.commit();
			
		}catch(PersistenceException e){
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return true;
	}

	@Override
	public boolean delete(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			CustomEntity entity1=entityManager.find(CustomEntity.class, id);
			
			entity1.setStatus(OrderStatus.INACTIVE.toString());
			
			entityManager.merge(entity1);
			
			entityTransaction.commit();
			
		}catch(PersistenceException e){
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		
		return false;
	}

	@Override
	public List<CustomEntity> readByName(String name) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readByName");
			query.setParameter("userName", name);
			read=query.getResultList();
			
			entityTransaction.commit();
			
		}catch(PersistenceException e){
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return read;
		
	}
	

}
