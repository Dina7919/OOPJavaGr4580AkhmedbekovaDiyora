package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HachModel implements iGetModel {
    private HashMap<Long, Student> studentsLHashMap;

    public HachModel(HashMap<Long, Student> studentsLHashMap) {
        this.studentsLHashMap = studentsLHashMap;
    }

    public HashMap<Long, Student> getAllStudentsHashMap()
    {
        return studentsLHashMap;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }

    @Override
    public List<Student> deleteAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllStudents'");
    }
    
}
