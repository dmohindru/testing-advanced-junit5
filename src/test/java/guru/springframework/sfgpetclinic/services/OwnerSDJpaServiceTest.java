package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled(value = "Disabled until we learn Mocking")
class OwnerSDJpaServiceTest {

    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
        service = new OwnerSDJpaService(null, null, null);
    }

    @Disabled(value = "Disabled until we learn Mocking")
    @Test
    void findByLastName() {
        Owner founderOwner = service.findByLastName("Buck");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}