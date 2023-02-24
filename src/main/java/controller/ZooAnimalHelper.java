/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 23, 2023
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ZooAnimals;

/**
 * @author abbyb
 *
 */
public class ZooAnimalHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("WebZooList");
	
	public void insertAnimal(ZooAnimals za) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(za);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<ZooAnimals> showAllAnimals(){
		EntityManager em = emfactory.createEntityManager();
		List<ZooAnimals> allAnimals = em.createQuery("SELECT i FROM ZooAnimals i").getResultList();
		return allAnimals;
	}

}
