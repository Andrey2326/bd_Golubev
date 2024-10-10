package com.mpt.journal.repository;

import com.mpt.journal.model.Subjects;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemorySubject {
    private final List<Subjects> SUBJECTS = new ArrayList<>();

    public List<Subjects> findAllSubjects(Long id) {
        return SUBJECTS;
    }

    public Subjects findSubjectById(Long id) {
        return SUBJECTS
                .stream()
                .filter(element -> element.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Subjects createSubject(Subjects subjects) {
        SUBJECTS.add(subjects);
        return subjects;
    }

    public Subjects updateSubject(Subjects subjects) {
        var subjectIndex = IntStream.range(0, SUBJECTS.size())
                .filter(index -> SUBJECTS.get(index).getId().equals(subjects.getId()))
                .findFirst()
                .orElse(-1);
        if (subjectIndex == -1) {
            return null;
        }
        SUBJECTS.set(subjectIndex, subjects);
        return subjects;
    }

    public void deleteSubject(Long id) {
        var subject = findSubjectById(id);
        if (subject != null) {
            SUBJECTS.remove(subject);
        }
    }
}

