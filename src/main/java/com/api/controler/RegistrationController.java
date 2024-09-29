    package com.api.controler;

    import com.api.entity.Registration;
    import com.api.services.RegistrationService;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/v1/registration")
    public class RegistrationController {

        private RegistrationService registrationService;

        // Constructor
        public RegistrationController(RegistrationService registrationService){
            this.registrationService = registrationService;
        }

        // GET method to fetch all registrations
        @GetMapping
        public ResponseEntity<List<Registration>> getAllRegistrations(){
            List<Registration> registrations = registrationService.getRegistrations();
            return new ResponseEntity<>(registrations, HttpStatus.OK);
        }

        // POST method to create a new registration
        @PostMapping
        public ResponseEntity<Registration> createRegistration(
                @RequestBody Registration registration
        ){
            registrationService.createRegistration(registration);
            return new ResponseEntity<>(registration, HttpStatus.CREATED);
        }
    }
