package com.springframework.bean;

import java.util.Map;  

public class Question {  
private int id;  
private String name;  

private Map<User, Answer> answers;
  
public Question() {}  
public Question(int id, String name, Map<User, Answer> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}
@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
}  
  


}  