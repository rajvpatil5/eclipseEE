package com.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class EmployeeProjectController {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeId(124);
		emp1.setEmployeeName("Ram2");
		emp2.setEmployeeId(224);
		emp2.setEmployeeName("Seeta2");
		
		
		Project project1 = new Project();
		Project project2 = new Project();
		
		project1.setProjectId(123);
		project1.setProjectName("VH4402");
		project2.setProjectId(224);
		project2.setProjectName("CH1232");
		
		List<Project> projectList = new ArrayList<Project>();
		projectList.add(project1);
		projectList.add(project2);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp1);
		
//		this will create table named employee_project
		emp1.setProject(projectList);
		emp2.setProject(projectList);

//		this will create another table named project_employee
//		project1.setEmployee(employeeList);
//		project2.setEmployee(employeeList);
		
		Session session = sessionfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		
		//using cascading we added projects
		session.save(project1);
		session.save(project2);
		
		transaction.commit();
		session.close();
		System.out.println("Done...");
	}

}
