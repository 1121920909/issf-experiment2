package com.zyp.issf.service;

import com.zyp.issf.domain.College;
import com.zyp.issf.domain.Major;
import com.zyp.issf.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ServiceTest {
    @Autowired
    private CollegeService service;
    @Autowired
    private MajorService majorService;
    @Autowired
    private StudentService studentService;
    @Test
    public void collegeServiceTest() {
        List<College> colleges = service.findCollege();
        for (College c : colleges) {
            System.out.println(c);
        }
    }

    @Test
    public void majorServiceTest() {
        List<Major> majors = majorService.findAllMajor();
        for (Major m : majors) {
            System.out.println(m);
        }
    }


}
