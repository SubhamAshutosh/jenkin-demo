package com.college.service;

import antlr.collections.List;
import com.college.Repository.CollegeRepository;
import com.college.model.CollegeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;



@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public void entryStudent(CollegeModel collegeModel){
      collegeRepository.save(collegeModel);
    }

//    public List<CollegeModel> getStudent(){
//        List<CollegeModel> studentList =(List<CollegeModel>) collegeRepository.findAll();
//        return studentList;
//    }
    public void deleteStudent(int rollNo){
    collegeRepository.deleteById(rollNo);
    }

    public CollegeModel getAll(int rollNo){
        CollegeModel collegeModel =collegeRepository.findById(rollNo).get();
        return collegeModel;
    }

    public void update(CollegeModel collegeModel,int rollNo ){
        CollegeModel college =collegeRepository.findById(rollNo).get();
        String collegeName= collegeModel.getCollegeName();
        college.setCollegeName(collegeName);
//        String name =collegeModel.getName();
//        college.setName(name);
          collegeRepository.save(college);
//        collegeRepository.save(name);
    }
}
