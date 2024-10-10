//package com.mpt.journal.repository;
//
//import com.mpt.journal.model.Subjects;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Collectors;
//
//@Repository
//public class InMemorySubjectRepository {
//    private List<Subjects> subjects = new ArrayList<>();
//    private AtomicInteger idCounter = new AtomicInteger(1);
//
//    public List<Subjects> findBySubjectName(String subjectName) {
//        return subjects.stream()
//                .filter(subject -> subject.getDescription().equalsIgnoreCase(subjectName) && !subject.isDeleted())
//                .collect(Collectors.toList());
//    }
//
//    public List<Subjects> filterSubjects(String subjectName, Boolean deleted, Integer id) {
//        return subjects.stream()
//                .filter(subject -> (subjectName == null || subject.getDescription().equalsIgnoreCase(subjectName)) &&
//                        (deleted == null || subject.isDeleted() == deleted) &&
//                        (id == null || subject.getId() == id))
//                .collect(Collectors.toList());
//    }
//
//    public void logicalDeleteSubject(int id) {
//        subjects.stream()
//                .filter(subject -> subject.getId() == id)
//                .forEach(subject -> subject.setDeleted(true));
//    }
//
//    public void logicalDeleteSubjects(List<Integer> ids) {
//        subjects.stream()
//                .filter(subject -> ids.contains(subject.getId()))
//                .forEach(subject -> subject.setDeleted(true));
//    }
//
//    public void deleteSubject(int id) {
//        subjects.removeIf(subject -> subject.getId() == id);
//    }
//
//    public Subjects addSubject(Subjects subject) {
//        subject.setId(idCounter.getAndIncrement());
//        subjects.add(subject);
//        return subject;
//    }
//
//    public Subjects updateSubject(Subjects subject) {
//        for (int i = 0; i < subjects.size(); i++) {
//            if (subjects.get(i).getId() == subject.getId()) {
//                subjects.set(i, subject);
//                return subject;
//            }
//        }
//        return null;
//    }
//
//    public List<Subjects> findAllSubjects() {
//        return new ArrayList<>(subjects);
//    }
//
//    public Subjects findSubjectById(int id) {
//        return subjects.stream()
//                .filter(subject -> subject.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//}
