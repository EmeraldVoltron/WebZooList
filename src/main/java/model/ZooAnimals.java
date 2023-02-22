/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 22, 2023
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abbyb
 *
 */
@Entity
@Table(name="animals")
public class ZooAnimals {
	@Id
 	@GeneratedValue
 	@Column(name="ID")
 	private int id;
 	@Column(name="SPECIES")
 	private String species;
 	@Column(name="NAME")
 	private String name;
 	
 	//TO-DO getters/setters, constructors, to strings
}
