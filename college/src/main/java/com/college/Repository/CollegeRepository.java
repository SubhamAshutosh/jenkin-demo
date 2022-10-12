package com.college.Repository;

import com.college.model.CollegeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends CrudRepository<CollegeModel,Integer> {

   
}
