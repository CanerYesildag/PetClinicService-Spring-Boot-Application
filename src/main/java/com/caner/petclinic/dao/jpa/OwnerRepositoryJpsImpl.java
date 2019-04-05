package com.caner.petclinic.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.caner.petclinic.dao.OwnerRepository;
import com.caner.petclinic.model.Owner;


@Repository//("ownerRepository")// Service te yaptığımız dependency injection ın instance sı
public class OwnerRepositoryJpsImpl implements OwnerRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Owner> findall() {
		return entityManager.createQuery("from Owner",Owner.class).getResultList();
	}

	@Override
	public Owner findbyId(Long id) {
		return entityManager.find(Owner.class,id);
	}

	@Override
	public List<Owner> findbyLastName(String lastname) {
		return entityManager.createQuery("from Owner where lastName= :lastname",Owner.class)
				.setParameter("lastName",lastname).getResultList();
	}

	@Override
	public void create(Owner owner) {
		entityManager.persist(owner);
	}

	@Override
	public Owner update(Owner owner) {
		return entityManager.merge(owner);
	}

	@Override
	public void deletebyId(Long id) {
		entityManager.remove(id);

	}

}
