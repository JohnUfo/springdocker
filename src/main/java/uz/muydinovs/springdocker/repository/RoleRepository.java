package uz.muydinovs.springdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.springdocker.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
