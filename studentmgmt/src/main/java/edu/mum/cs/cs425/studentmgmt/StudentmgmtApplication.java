package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.parser.Entity;
import java.util.Date;

//@SpringBootApplication
public class StudentmgmtApplication {

    //public static void main(String[] args) {
      //  SpringApplication.run(StudentmgmtApplication.class, args);
    //}
    public  static  void  main(String[] args){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("StudentmgmtApplication");
        saveStudent(entityManagerFactory);
        entityManagerFactory.close();
    }

    private static void saveStudent(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Transcript transcript= new Transcript("BS Computer Science");
            Classroom classroom=new Classroom("McLaughlin Building","M105");
            Student student=new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, new Date());
            student.setTranscript(transcript);
            student.setClassroom(classroom);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
