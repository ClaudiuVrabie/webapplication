package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@Repository
public class StudentsGradesRepository {
    public Set<StudentsGrades> getStudentsGrades(){

        Set<StudentsGrades> studentGradesSet = new TreeSet<>(new Comparator<StudentsGrades>() {
            @Override
            public int compare(StudentsGrades o1, StudentsGrades o2) {
                return 0;
            }
        });

        StudentsGrades student1 = new StudentsGrades(5.7f,8.6f,5.5f,9);
        StudentsGrades student2 = new StudentsGrades(8.5f,6,9,7.3f);
        StudentsGrades student3 = new StudentsGrades(9.7f,10,5.8f,9.7f);

        studentGradesSet.add(student1);
        studentGradesSet.add(student2);
        studentGradesSet.add(student3);

        return studentGradesSet;

    }

}
