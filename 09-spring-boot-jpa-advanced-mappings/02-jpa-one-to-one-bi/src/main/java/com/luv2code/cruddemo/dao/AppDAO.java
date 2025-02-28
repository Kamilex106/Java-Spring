package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.enity.Instructor;
import com.luv2code.cruddemo.enity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
