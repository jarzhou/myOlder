package com.both.older.service.Impl;

import com.both.older.dao.OlderDao;
import com.both.older.dto.OlderDto;
import com.both.older.entity.OlderEntity;
import com.both.older.service.interfaces.OlderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OlderServiceImpl implements OlderService {

    @Resource
    private OlderDao olderDao;

    @Override
    public List<OlderEntity> findAllOlder(){
        return olderDao.findAllOlder();
    }

}
