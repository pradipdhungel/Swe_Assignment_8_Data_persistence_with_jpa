package edu.mum.cs.cs425.studentmgmt.service;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repo.ClassroomRepo;
import edu.mum.cs.cs425.studentmgmt.repo.StudentRepo;
import edu.mum.cs.cs425.studentmgmt.repo.TranscriptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


public class StudentService {
    private final StudentRepo studentRepo;
    private final TranscriptRepo transcriptRepo;
    private final ClassroomRepo classroomRepo;
    @Autowired
    public StudentService(StudentRepo studentRepo, TranscriptRepo transcriptRepo, ClassroomRepo classroomRepo) {
        this.studentRepo = studentRepo;
        this.transcriptRepo = transcriptRepo;
        this.classroomRepo = classroomRepo;
    }
    //Long studentID, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, Date dateOfEnrollment
    public void saveStudent(){
        Transcript transcript= new Transcript("BS Computer Science");
        Classroom classroom=new Classroom("McLaughlin Building","M105");
        Student student=new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, new Date());
        student.setTranscript(transcript);
        student.setClassroom(classroom);
    }
}
