package com.zyp.issf.dao;

import com.zyp.issf.domain.College;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CollegeDaoTest {
    @Autowired
    private CollegeDao dao;

    @Test
    public void findAllCollegeTest() {
        List<College> colleges = dao.findAllCollege();
        for (College c : colleges) {
            System.out.println(c);
        }
    }
}
