package com.zyp.issf.dao;

import com.zyp.issf.domain.Major;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MajorDaoTest {
    @Autowired
    private MajorDao dao;

    @Test
    public void findAllMajorTest() {
        List<Major> majors = dao.findAllMajor();
        for (Major m : majors) {
            System.out.println(m);
        }

    }
}
