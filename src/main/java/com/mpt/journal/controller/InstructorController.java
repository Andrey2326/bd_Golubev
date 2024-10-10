package com.mpt.journal.controller;

import com.mpt.journal.service.InstructorService;
import org.springframework.stereotype.Controller;
import com.mpt.journal.model.InstructorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructors")
    public String getAllInstructors(Model model) {
        model.addAttribute("instructors", instructorService.findAllInstructors());
        return "instructorList";
    }

    @PostMapping("/instructors/add")
    public String addInstructor(@RequestParam String name,
                                @RequestParam String lastName,
                                @RequestParam String firstName,
                                @RequestParam String middleName) {
        InstructorModel newInstructor = new InstructorModel(0, name, lastName, firstName, middleName);
        instructorService.addInstructor(newInstructor);
        return "redirect:/instructors";
    }

    @PostMapping("/instructors/update")
    public String updateInstructor(@RequestParam int id,
                                   @RequestParam String name,
                                   @RequestParam String lastName,
                                   @RequestParam String firstName,
                                   @RequestParam String middleName) {
        InstructorModel updatedInstructor = new InstructorModel(id, name, lastName, firstName, middleName);
        instructorService.updateInstructor(updatedInstructor);
        return "redirect:/instructors";
    }

    @PostMapping("/instructors/delete")
    public String deleteInstructor(@RequestParam int id) {
        instructorService.deleteInstructor(id);
        return "redirect:/instructors";
    }
}

