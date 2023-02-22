/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 22, 2023
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abbyb
 *
 */
@Entity
@Table(name="zookeeper")
public class ZooKeeper {
	@Id
	@GeneratedValue
	private int id;
	private String keeperName;
	
	//TO-DO add getters/setters constructors and to string
}
