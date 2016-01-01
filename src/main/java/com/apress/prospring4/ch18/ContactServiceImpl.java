package com.apress.prospring4.ch18;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

@Repository

@Service("contactService")
@Component
public class ContactServiceImpl implements ContactService {
	private ContactRepository contactRepository;


	public List<Contact> findAll() {
		return Lists.newArrayList(contactRepository.findAll());
	}


	public Contact findById(Long id) {
		return contactRepository.findOne(id);
	}

	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}
	@Autowired 
	public void setContactRepository(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}



	public Page<Contact> findAllByPage(Pageable pageable) {
		return contactRepository.findAll(pageable);
	}

}
