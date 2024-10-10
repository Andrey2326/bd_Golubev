// package com.mpt.journal.service;
// import com.mpt.journal.entity.SubjectEntity; // Раскомментируйте, если требуется
// import com.mpt.journal.model.Subjects; // Изменено на Subjects
// import com.mpt.journal.repository.InMemorySubjectRepository; // Раскомментируйте, если требуется
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class InMemorySubjectServiceImpl implements SubjectService {

//     private final InMemorySubjectRepository subjectRepository;

//     public InMemorySubjectServiceImpl(InMemorySubjectRepository subjectRepository) {
//         this.subjectRepository = subjectRepository;
//     }

//     @Override
//     public List<Subjects> findAllSubjects() {
//         return subjectRepository.findAllSubjects();
//     }

//     @Override
//     public Subjects findSubjectById(int id) {
//         return subjectRepository.findSubjectById(id);
//     }

//     @Override
//     public Subjects addSubject(Subjects subject) {
//         return subjectRepository.addSubject(subject);
//     }

//     @Override
//     public Subjects updateSubject(Subjects subject) {
//         return subjectRepository.updateSubject(subject);
//     }

//     @Override
//     public void deleteSubject(int id) {
//         subjectRepository.deleteSubject(id);
//     }

//     @Override
//     public void logicalDeleteSubject(int id) {
//         subjectRepository.logicalDeleteSubject(id); // Логическое удаление
//     }

//     @Override
//     public List<Subjects> findBySubjectName(String subjectName) {
//         return subjectRepository.findBySubjectName(subjectName); // Поиск
//     }

//     @Override
//     public List<Subjects> filterSubjects(String subjectName, Boolean deleted, Integer id) {
//         return subjectRepository.filterSubjects(subjectName, deleted, id); // Фильтрация
//     }

//     @Override
//     public void logicalDeleteSubjects(List<Integer> ids) {
//         subjectRepository.logicalDeleteSubjects(ids); // Множественное логическое удаление
//     }
// }

