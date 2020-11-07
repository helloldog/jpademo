
package com;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UserDO, Long> {

    @Query(value = "select * from auth_user  where name = ?", nativeQuery = true)
    List<UserDO> findByName(String Name);
}