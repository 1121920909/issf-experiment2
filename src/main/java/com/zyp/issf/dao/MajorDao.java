package com.zyp.issf.dao;

import com.zyp.issf.domain.Major;

import java.util.List;

public interface MajorDao {
    List<Major> findAllMajor();
}
