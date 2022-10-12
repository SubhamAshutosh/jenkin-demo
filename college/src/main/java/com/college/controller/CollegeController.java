package com.college.controller;

import com.college.model.CollegeModel;
import com.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@RequestMapping("api")
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @PostMapping("/insert/student")
    public void entryStudent(@RequestBody CollegeModel collegeModel){
        collegeService.entryStudent(collegeModel);
    }
    //get All
    @GetMapping("/get/student")
    public List<CollegeModel> getStudent(){
        List<CollegeModel> studentList= (List<CollegeModel>) collegeService.getStudent();
        return studentList;
    }
    @PutMapping("/update/{rollNo}")
    public void update(@PathVariable(name = "rollNo") int rollNo, @RequestBody CollegeModel collegeModel){
        collegeService.update(collegeModel,rollNo);
    }

    @DeleteMapping("/deleteStudent/{rollNo}")
    public void deleteStudent(@PathVariable (name="rollNo") int rollNo){
        collegeService.deleteStudent(rollNo);
    }
    @GetMapping("/get/{rollNo}")
    public CollegeModel getAll(@PathVariable (name = "rollNo") int rollNo){
      CollegeModel collegeModel = collegeService.getAll(rollNo);
      return collegeModel;
    }

}
