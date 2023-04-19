package org.springframework.samples.petclinic.vet;

import org.springframework.beans.factory.annotation.Autowired;

public class VetService {

	@Autowired
	VetRepository vetRepository;

	public Vet createVet(String firstName, String lastName, Set<Specialty> specialties) {
		Vet vet = new Vet();
		vet.setFirstName(firstName);
		vet.setLastName(lastName);
		specialties.forEach(vet::addSpecialty);
	}
}
