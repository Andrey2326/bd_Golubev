package com.mpt.journal.repository;

import com.mpt.journal.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subjects, Long> {
}

