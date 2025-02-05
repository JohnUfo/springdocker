package uz.muydinovs.springdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.muydinovs.springdocker.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
