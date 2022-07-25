package com.Trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trax.entity.Contacts;
import com.Trax.entity.Lead;
import com.Trax.repositories.ContactsRepository;
@Service
public class ContactServiceImpl implements ContactService {
@Autowired
private ContactsRepository contactRepo;
	@Override
	public void saveContact(Contacts contact) {
contactRepo.save(contact);
	}
	@Override
	public List<Contacts> listAllContacts() {
	List<Contacts> contacts = contactRepo.findAll();
	return contacts;
	}
	@Override
	public Contacts findContactById(long id) {
Optional<Contacts> contact = contactRepo.findById(id);
Contacts contacts = contact.get();
		return contacts;
	}

}
