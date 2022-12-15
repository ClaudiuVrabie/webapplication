package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CatalogueService {


    @Autowired
    public CatalogueService(StudentsGradesRepository studentGradesRepository, StudentsRepository studentsRepository) {
        this.studentGradesRepository = studentGradesRepository;
        this.studentsRepository = studentsRepository;
    }

    private final StudentsGradesRepository studentGradesRepository;
    private final StudentsRepository studentsRepository;

    public String createStudentCatalogue() {
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String result = "";


        for (Student student : studentListToBeProcessed) {
            result = result.concat(student.getFirstName()).concat(" ").concat(student.getLastName().concat("<br></br>"));
        }

        return result;
    }

    public float calculateMathematicalAverage() {
        Set<StudentsGrades> studentGradesToBeProcessed = studentGradesRepository.getStudentsGrades();
        StudentsGrades student = null;
        float average = (student.getChemistry() +
                student.getPhysics() +
                student.getEconomics() +
                student.getMath()) / 4;
        return average;

    }



}