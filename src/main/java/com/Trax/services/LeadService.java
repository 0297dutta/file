package com.Trax.services;

import java.util.List;

import com.Trax.entity.Lead;

public interface LeadService {
public void saveLeadInfo(Lead lead);

public Lead findLeadById(long id);

public void deleteLead(long id);

public List<Lead> getAllLeads();
}
