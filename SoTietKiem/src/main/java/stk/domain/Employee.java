/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.domain;


import javax.persistence.*;
  
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
 
    private String name;
     
  
 
    public Employee(String name) {
        this.name = name;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +  "]";
    }
 
}