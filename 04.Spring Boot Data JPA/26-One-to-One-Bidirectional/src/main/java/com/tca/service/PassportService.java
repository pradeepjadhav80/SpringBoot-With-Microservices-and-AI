package com.tca.service;

import com.tca.entity.Passport;

public interface PassportService 
{
	public Passport savePassport(Passport passport);
	public Passport fetchPassportById(Long id);
	public void removePassportById(Long id);
}
