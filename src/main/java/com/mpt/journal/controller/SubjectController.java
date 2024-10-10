//package com.mpt.journal.controller;
//import com.mpt.journal.model.SubjectModel;
//import com.mpt.journal.service.SubjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//public class SubjectController {
//
//    @Autowired
//    private SubjectService subjectService;
//
//    @GetMapping("/subjects")
//    public String getAllSubjects(Model model) {
//        model.addAttribute("subjects", subjectService.findAllSubjects());
//        return "subjectList";
//    }
//
//    @PostMapping("/subjects/add")
//    public String addSubject(@RequestParam String subjectName) {
//        SubjectModel newSubject = new SubjectModel(0, subjectName);
//        subjectService.addSubject(newSubject);
//        return "redirect:/subjects";
//    }
//
//    @PostMapping("/subjects/update")
//    public String updateSubject(@RequestParam int id, @RequestParam String subjectName) {
//        SubjectModel updatedSubject = new SubjectModel(id, subjectName);
//        subjectService.updateSubject(updatedSubject);
//        return "redirect:/subjects";
//    }
//
//    @PostMapping("/subjects/delete")
//    public String deleteSubject(@RequestParam int id) {
//        subjectService.deleteSubject(id);
//        return "redirect:/subjects";
//    }
//
//    @GetMapping("/subjects/search")
//    public String searchSubjects(@RequestParam String subjectName, Model model) {
//        model.addAttribute("subjects", subjectService.findBySubjectName(subjectName));
//        return "subjectList";
//    }
//
//    @GetMapping("/subjects/filter")
//    public String filterSubjects(@RequestParam(required = false) String subjectName,
//                                @RequestParam(required = false) Boolean deleted,
//                                @RequestParam(required = false) Integer id,
//                                Model model) {
//        model.addAttribute("subjects", subjectService.filterSubjects(subjectName, deleted, id));
//        return "subjectList";
//    }
//
//    @PostMapping("/subjects/deleteMultiple")
//    public String deleteMultipleSubjects(@RequestParam List<Integer> ids) {
//        subjectService.logicalDeleteSubjects(ids);
//        return "redirect:/subjects";
//    }
//
//    @PostMapping("/subjects/delete/logical")
//    public String logicalDeleteSubject(@RequestParam int id) {
//        subjectService.logicalDeleteSubject(id);
//        return "redirect:/subjects";
//    }
//
//    @PostMapping("/subjects/deletePermanent")
//    public String deletePermanentSubject(@RequestParam int id) {
//        subjectService.deleteSubject(id);
//        return "redirect:/subjects";
//    }
//}
