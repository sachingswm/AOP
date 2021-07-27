package com.example.aop.service;

import com.example.aop.dao.HomosepienDao;
import com.example.aop.entity.Homosepien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomosepienService {
    @Autowired
    private HomosepienDao homosepienDao;


    public void saveHomosepien(Homosepien homosepien) {
        homosepien.setBirthTime(System.currentTimeMillis());
        homosepienDao.save(homosepien);
    }

    public void deleteHomosepien(int id)
    {
        int deleted_id=id;
        long birthTime=homosepienDao.getById(id).getBirthTime();
        deleteHomosepien(id,birthTime,System.currentTimeMillis());
    }

    public void deleteHomosepien(int id,long birthTime,long deathTime)
    {
        homosepienDao.deleteById(id);
    }

}
