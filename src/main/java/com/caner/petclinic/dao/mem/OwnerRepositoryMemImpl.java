package com.caner.petclinic.dao.mem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.caner.petclinic.dao.OwnerRepository;
import com.caner.petclinic.model.Owner;

@Repository
public class OwnerRepositoryMemImpl implements OwnerRepository {
	
	
	Map<Long, Owner> ownersmap = new HashMap<Long, Owner>();
	
	
	
	public OwnerRepositoryMemImpl() {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Caner");
		owner1.setLastName("Yeşildağ");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("John");
		owner2.setLastName("Snow");
		
		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setFirstName("Alison");
		owner3.setLastName("Baker");
		
		ownersmap.put(owner1.getId(), owner1);
		ownersmap.put(owner2.getId(),owner2);
		ownersmap.put(owner3.getId(),owner3);
			
	}
	


	@Override
	public List<Owner> findall() {
		return new ArrayList<>(ownersmap.values());
	}

	@Override
	public Owner findbyId(Long id) {
		return ownersmap.get(id);
	}

	@Override
	public List<Owner> findbyLastName(String lastname) {
		return ownersmap.values().stream().filter(o->o.getLastName().equals(lastname)).collect(Collectors.toList());
	}

	@Override
	public void create(Owner owner) {
		owner.setId(new Date().getTime());
		ownersmap.put(owner.getId(), owner);

	}

	@Override
	public Owner update(Owner owner) {
		ownersmap.replace(owner.getId(), owner);
		return owner;
	}

	@Override
	public void deletebyId(Long id) {
		ownersmap.remove(id);

	}

}
