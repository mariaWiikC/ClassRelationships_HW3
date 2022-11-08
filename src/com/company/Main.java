package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Project project = new Project("Project 1");
        Task task1 = new Task("Task 1");
        project.addTask(task1);

        task1.addWorker(new Employee("Maria"));
        task1.addWorker(new HiredContractor("Steve"));

        System.out.println(project);
    }
}
