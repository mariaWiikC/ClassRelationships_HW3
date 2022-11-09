package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Company company = new Company();

        // Project 1
        Project project1 = new Project("Project 1");
        company.addProject(project1);

        Task task1 = new Task("Task 1");
        project1.addTask(task1);
        task1.addWorker(new Employee("Maria"));
        task1.addWorker(new HiredContractor("Steve"));

        // Project 2
        Project project2 = new Project("Project 2");
        company.addProject(project2);

        Task task2 = new Task("Task 2");
        project2.addTask(task2);
        task2.addWorker(new Employee("Peter"));

        Task task3 = new Task("Task 3");
        project2.addTask(task3);
        task3.addWorker(new HiredContractor("Jennifer"));
        System.out.println(company);
    }
}
