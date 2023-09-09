package edu.mum.cs.cs425.studentmgmt.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import  java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long studentID;

    @Column(nullable=false,unique = true)
    private String studentNumber;
    @Column(nullable=false)
    private  String firstName;

    private String middleName;
    @Column(nullable=false)
    private  String lastName;
    private Double cgpa;
    @Temporal(TemporalType.DATE)
    private Date dateOfEnrollment;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "transcript_id")
    private Transcript transcript;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "Classroom_id")
    private  Classroom classroom;

    public Student() {

    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, Date dateOfEnrollment) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Date getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
