package com.hnu.elvis.mapper;

import com.hnu.elvis.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Elvis on 2020/6/1.
 */
//@Mapper         //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
//@Repository     //和Mapper二选一即可
public interface UserMapper {
    List<User> getAllUser();
}
