package com.sailingpappi.reverie.repository;

import com.sailingpappi.reverie.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
    public List<Role> findAll();
    public Role findByRoleId(String id);
    public Role findByRole(String role);

    @Query(value = "SELECT role FROM roles WHERE role_id IN (SELECT role_id FROM user_role WHERE user_id = ?1)", nativeQuery = true)
    List<String> findByUserId(String userId);
}
