package com.api.services;

import com.api.entity.Registration;
import com.api.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    private RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }
    public List<Registration> getRegistrations(){
        List<Registration> registrations = registrationRepository.findAll();
return registrations;
    }
    public void createRegistration(Registration registration){

    }
}
