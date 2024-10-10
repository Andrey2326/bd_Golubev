package com.mpt.journal.service;

import com.mpt.journal.model.Subjects; // Убедитесь, что у вас есть класс Subjects
import com.mpt.journal.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository repository) {
        this.subjectRepository = repository;
    }

    @Override
    public List<Subjects> findAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subjects createSubjects(Subjects subjects) {
        return subjectRepository.save(subjects);
    }

    @Override
    public Subjects updateSubjects(Subjects subjects) {
        return subjectRepository.save(subjects);
    }

    @Override
    public Subjects findSubjectsById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSubjects(Long id) {
        subjectRepository.deleteById(id);
    }
}
