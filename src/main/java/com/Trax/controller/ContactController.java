package com.Trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Trax.entity.Contacts;
import com.Trax.entity.Lead;
import com.Trax.services.ContactService;
import com.Trax.services.LeadService;

@Controller
public class ContactController {
@Autowired
	private LeadService leadService;
@Autowired
private ContactService contactService; 
@RequestMapping("convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model )
{
Lead lead= leadService.findLeadById(id);
Contacts contact = new Contacts();
contact.setFirstName(lead.getFirstName());
contact.setLastName(lead.getLastName());
contact.setLeadSource(lead.getLeadSource());
contact.setEmail(lead.getEmail());
contact.setMobile(lead.getMobile());
contactService.saveContact(contact);
leadService.deleteLead(id);
List<Contacts> contacts = contactService.listAllContacts();
model.addAttribute("contacts", contacts);
return "contact_search_result";
}
@RequestMapping("/contactInfo")
public String leadInfo(@RequestParam("id") long id,ModelMap model)
{
Contacts contact = contactService.findContactById(id);
	model.addAttribute("contact", contact);
	return "contact_info";
}
}
