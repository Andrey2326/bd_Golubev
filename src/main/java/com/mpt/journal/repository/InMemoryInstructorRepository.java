package com.mpt.journal.repository;

import org.springframework.stereotype.Repository;
import com.mpt.journal.model.InstructorModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryInstructorRepository {
    private List<InstructorModel> instructors = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger(1);

    public InstructorModel addInstructor(InstructorModel instructor) {
        instructor.setId(idCounter.getAndIncrement());
        instructors.add(instructor);
        return instructor;
    }

    public InstructorModel updateInstructor(InstructorModel instructor) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getId() == instructor.getId()) {
                instructors.set(i, instructor);
                return instructor;
            }
        }
        return null; // Инструктор не найден
    }

    public void deleteInstructor(int id) {
        instructors.removeIf(instructor -> instructor.getId() == id);
    }

    public List<InstructorModel> findAllInstructors() {
        return new ArrayList<>(instructors);
    }

    public InstructorModel findInstructorById(int id) {
        return instructors.stream()
                .filter(instructor -> instructor.getId() == id)
                .findFirst()
                .orElse(null);
    }
}


