package com.user;

public class Registration {
	    private int id;
	    private String name;
	    private String email;
	    private String dateOfBirth;

	    // Constructors
	    public Registration() {
	    }

	    public Registration(int id, String name, String email, String dateOfBirth) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.dateOfBirth = dateOfBirth;
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    // Setters
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setDateOfBirth(String dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    // Override toString() method for debugging purposes
	    @Override
	    public String toString() {
	        return "Registration{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", dateOfBirth='" + dateOfBirth + '\'' +
	                '}';
	    }
	}
