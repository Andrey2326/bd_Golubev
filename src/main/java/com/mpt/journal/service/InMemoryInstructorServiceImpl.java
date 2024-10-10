package com.mpt.journal.service;
import com.mpt.journal.model.InstructorModel;
import com.mpt.journal.repository.InMemoryInstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryInstructorServiceImpl implements InstructorService {

    private final InMemoryInstructorRepository instructorRepository;

    public InMemoryInstructorServiceImpl(InMemoryInstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<InstructorModel> findAllInstructors() {
        return instructorRepository.findAllInstructors();
    }

    @Override
    public InstructorModel findInstructorById(int id) {
        return instructorRepository.findInstructorById(id);
    }

    @Override
    public InstructorModel addInstructor(InstructorModel instructor) {
        return instructorRepository.addInstructor(instructor);
    }

    @Override
    public InstructorModel updateInstructor(InstructorModel instructor) {
        return instructorRepository.updateInstructor(instructor);
    }

    @Override
    public void deleteInstructor(int id) {
        instructorRepository.deleteInstructor(id);
    }
}


