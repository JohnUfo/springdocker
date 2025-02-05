package uz.muydinovs.springdocker.init;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationRunner implements CommandLineRunner {

//    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
//        Role roleUser = new Role(null, "123", "ROLE_USER");
//        Role roleAdmin = new Role(null, "124", "ROLE_ADMIN");
//        roleRepository.save(roleUser);
//        roleRepository.saveAll(asList(roleUser, roleAdmin));
    }
}
