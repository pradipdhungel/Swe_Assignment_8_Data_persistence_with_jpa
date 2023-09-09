package edu.mum.cs.cs425.studentmgmt.repo;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepo extends JpaRepository<Transcript,Long> {

}
