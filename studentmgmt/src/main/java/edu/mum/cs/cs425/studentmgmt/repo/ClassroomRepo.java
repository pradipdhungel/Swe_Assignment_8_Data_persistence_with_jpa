package edu.mum.cs.cs425.studentmgmt.repo;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepo extends JpaRepository<Classroom,Long> {
}
