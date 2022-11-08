package com.company;

import java.util.ArrayList;

class Project
{
    private int projectId;
    public static int nextProjectId = 0;
    String name;

    ArrayList<Task> tasks;

    public Project(String name)
    {
        this.name = name;
        this.projectId = nextProjectId;
        nextProjectId++;
        tasks = new ArrayList<>();
    }

    public void addTask(Task task)
    {
        tasks.add(task);
    }

    public String arrayToString (ArrayList array)
    {
        StringBuffer sb = new StringBuffer();
        for (Object s : array)
        {
            sb.append(s + " ");
        }
        return sb.toString();
    }

    public String toString()
    {
        return name + ", id: " + projectId + ", Tasks: " + arrayToString(tasks);
    }

}

class Task extends Project
{
    ArrayList<Worker> workers;

    public Task(String name)
    {
        super(name);
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker)
    {
        workers.add(worker);
    }

    public String toString()
    {
        return name + " (Workers: " + arrayToString(workers) + ")";
    }
}

class Worker
{
    String name;

    public Worker(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}

class Employee extends Worker
{
    public Employee(String name)
    {
        super(name);
    }
}

class HiredContractor extends Worker
{
    public HiredContractor(String name)
    {
        super(name);
    }
}