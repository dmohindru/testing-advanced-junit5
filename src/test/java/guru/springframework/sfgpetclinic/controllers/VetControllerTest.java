package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Tag("controllers")
class VetControllerTest {
    VetService vetService;
    VetController vetController;
    SpecialtyService specialtyService;
    Model model;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        vetController = new VetController(vetService);

        Vet vet1 = new Vet(1L, "joe", "buck", null);
        Vet vet2 = new Vet(2L, "jimmy", "smith", null);
        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    void testController() {
        Model model = new ModelMapImpl();
        assertEquals("vets/index", vetController.listVets(model));

        Set modelAttributes =(Set) ((ModelMapImpl)model).getMap().get("vets");

        assertThat(modelAttributes.size()).isEqualTo(2);
    }
}