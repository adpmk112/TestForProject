package com.example.project.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address implements Serializable {
	String city;
	String township;
}