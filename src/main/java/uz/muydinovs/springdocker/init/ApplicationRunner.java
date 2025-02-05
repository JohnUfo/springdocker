package uz.muydinovs.springdocker.init;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.muydinovs.springdocker.model.Role;
import uz.muydinovs.springdocker.repository.RoleRepository;

@Component
@RequiredArgsConstructor
public class ApplicationRunner implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if "ROLE_USER" already exists
        Role roleUser = roleRepository.findByName("ROLE_USER");
        if (roleUser == null) {
            roleUser = new Role(null, "123", "ROLE_USER");
            roleRepository.save(roleUser);
        }

        // Check if "ROLE_ADMIN" already exists
        Role roleAdmin = roleRepository.findByName("ROLE_ADMIN");
        if (roleAdmin == null) {
            roleAdmin = new Role(null, "124", "ROLE_ADMIN");
            roleRepository.save(roleAdmin);
        }
    }
}
