package com.mpt.journal.service;

import com.mpt.journal.model.Subjects; // Убедитесь, что у вас есть класс Subjects

import java.util.List;

public interface SubjectService {
    List<Subjects> findAllSubjects();
    Subjects createSubjects(Subjects subjects);
    Subjects updateSubjects(Subjects subjects);
    Subjects findSubjectsById(Long id);
    void deleteSubjects(Long id);
}

