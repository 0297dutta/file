package com.Trax.services;

import java.util.List;

import com.Trax.entity.Contacts;
import com.Trax.entity.Lead;

public interface ContactService {
public void saveContact(Contacts contact);
public List<Contacts> listAllContacts();
public Contacts findContactById(long id);
}
