package org.vijay.association;

import java.util.List;

public class College {
    private String collegeName;
    private List<Departments> departments;

    public College(String name, List<Departments> departments) {
        this.collegeName = name;
        this.departments = departments;
    }

    public static void fetchAllDepartmentsWithStudentDetails(String name, List<Departments> departments) {
        System.out.println("College name is:" + name);
        for (Departments department : departments) {
            System.out.println("Department name is: " + department.getName());
            List<Students> listOfStudent = department.getStudents();
            listOfStudent.forEach(System.out::println);
        }

    }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName + ", departments=" + departments + "]";
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Departments> departments) {
        this.departments = departments;
    }


}
