package com.springframework.bean;

import java.util.Map;  

public class Question {  
private int id;  
private String name;  

private Map<User, Answer> answers;
 
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Map<User, Answer> getAnswers() {
	return answers;
}

public void setAnswers(Map<User, Answer> answers) {
	this.answers = answers;
}

@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
}  
  


}  