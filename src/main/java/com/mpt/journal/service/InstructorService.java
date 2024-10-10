package com.mpt.journal.service;

import com.mpt.journal.model.InstructorModel;

import java.util.List;

public interface InstructorService {
    public List<InstructorModel> findAllInstructors();
    public InstructorModel findInstructorById(int id);
    public InstructorModel addInstructor(InstructorModel instructor);
    public InstructorModel updateInstructor(InstructorModel instructor);
    public void deleteInstructor(int id);
}

