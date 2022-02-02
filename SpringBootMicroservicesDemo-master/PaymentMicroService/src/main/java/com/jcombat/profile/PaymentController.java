package com.jcombat.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Autowired
	ProfileRepository profileRepository;
	
	@RequestMapping("/Payment")
	public int booking(@RequestBody PaymentModel PaymentModel) {
		//write the code for payment
	}

}