package com.company;

import java.util.ArrayList;

class Company
{
    private ArrayList<Project> projects;
    public Company()
    {
        projects = new ArrayList<>();
    }

    public void addProject(Project project)
    {
        projects.add(project);
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
        return "List of projects: "+ "\n" + arrayToString(projects);
    }

    public String getProjects()
    {
        return arrayToString(projects);
    }

    public void setProjects(ArrayList<Project> projects)
    {
        this.projects = projects;
    }
}

class Project extends Company
{
    private int projectId;
    public static int nextProjectId = 0;
    public String name;

    private ArrayList<Task> tasks;

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

    public String toString()
    {
        return name + ", id: " + projectId + " - Tasks: " + arrayToString(tasks) + "\n";
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }

    public String getTasks()
    {
        return arrayToString(tasks);
    }

    public void setTasks(ArrayList<Task> tasks)
    {
        this.tasks = tasks;
    }
}

class Task extends Project
{
    private ArrayList<Worker> workers;

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

    public String getWorkers()
    {
        return arrayToString(workers);
    }

    public void setWorkers(ArrayList<Worker> workers)
    {
        this.workers = workers;
    }
}

class Worker
{
    public String name;

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

    public String toString()
    {
        return name + " = Employee,";
    }
}

class HiredContractor extends Worker
{
    public HiredContractor(String name)
    {
        super(name);
    }

    public String toString()
    {
        return name + " = Hired contractor,";
    }
}