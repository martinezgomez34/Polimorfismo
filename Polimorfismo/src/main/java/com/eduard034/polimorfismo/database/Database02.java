package com.eduard034.polimorfismo.database;

import com.eduard034.polimorfismo.models.IComunication;
import com.eduard034.polimorfismo.models.Student;

import java.util.ArrayList;

public class Database02 implements IComunication {
    private  ArrayList<Student> estudiantes;
    public Database02(){
        estudiantes=new ArrayList<>();
    }

    @Override
    public boolean updateStudent(Student student) {
        for (int i=0;i<estudiantes.size();i++){
            Student students = estudiantes.get(i);
            if (students.getNombre()==student.getNombre()){
                estudiantes.set(i,student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean saveStudent(Student student) {
        return estudiantes.add(student);
    }
    public ArrayList<Student> getEstudiantes() {
        return estudiantes;
    }
}
