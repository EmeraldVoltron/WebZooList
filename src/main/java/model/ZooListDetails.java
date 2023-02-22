/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 22, 2023
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author abbyb
 *
 */
@Entity
public class ZooListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalTime tripDate;
	private ZooKeeper zooKeeper;
	private List<ZooAnimals> listOfAnimals;

	//TO-DO getters/setters, to strings, constructors, relationships (oneToMany, manyToOne)
}
