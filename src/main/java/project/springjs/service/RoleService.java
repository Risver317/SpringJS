package project.springjs.service;


import project.springjs.model.Role;

import java.util.List;
import java.util.Set;


public interface RoleService {
    List<Role> findAllRole();

    void addDefaultRole();

    Set<Role> findByIdRoles(List<Long> roles);
}
