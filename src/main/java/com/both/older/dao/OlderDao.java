package com.both.older.dao;


import com.both.older.entity.OlderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OlderDao {
    /*查找older用户所有信息*/
    @Select("select * from t_older")
    List<OlderEntity> findAllOlder();


}
