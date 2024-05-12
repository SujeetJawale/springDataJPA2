package com.sujeet.springDataJpa2.service;

import com.sujeet.springDataJpa2.dao.Vaccine;

public interface IVaccineService 
{
	 public String registerVaccineInfo(Vaccine vaccineInfo);
     public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
     public Long getVaccinesCount();
     public Boolean checkAvailability(Integer id);
     public Iterable<Vaccine> getAllVaccinesInfo();
     public Iterable<Vaccine> getAllVaccinesInfoSpecific(Iterable<Integer> ids);
}
