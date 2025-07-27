package com.expense_tracker_app.exp_track.repository;

import com.expense_tracker_app.exp_track.entity.Role;
import com.expense_tracker_app.exp_track.entity.RoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);
}
