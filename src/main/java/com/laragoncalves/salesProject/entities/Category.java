package com.laragoncalves.salesProject.entities;

import java.nio.MappedByteBuffer;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>();
	
	private Category() {
		
	}
	
	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
		
	}

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(products, other.products);
	}

	public Set<Product> getProducts() {
		return products;
	}

	
	
	
}