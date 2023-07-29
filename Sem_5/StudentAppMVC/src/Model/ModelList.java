package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    public List<Student> deleteAllStudents(int numberOfStudent)
    {
        students.remove(numberOfStudent);
        return students;
    }

    @Override
    public List<Student> deleteAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllStudents'");
    }
}