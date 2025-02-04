package project.springjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springjs.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}