package com.turneame.entities;

import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Turno")
public class Turno {

    private Integer id;

    private String name;

    private String notes;

    private URL website;

    private boolean starred;

	public Turno(Integer id, String name, String notes, URL website, boolean starred) {
		super();
		this.id = id;
		this.setName(name);
		this.setNotes(notes);
		this.setWebsite(website);
		this.setStarred(starred);
	}

	@Id
	@Column(name = "starred")
	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	public URL getWebsite() {
		return website;
	}

	public void setWebsite(URL website) {
		this.website = website;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    
}

