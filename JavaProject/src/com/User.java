package com;

import lombok.Data;

@Data

public class User {



	private String name;



	private String gender;



	private int age;

	User() {
	}

	

	User(String _name, String _gender, int _age) {

		name = _name;

		gender = _gender;

		age = _age;

	}

}