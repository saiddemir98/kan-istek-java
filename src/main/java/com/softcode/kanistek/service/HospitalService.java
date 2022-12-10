package com.softcode.kanistek.service;

import com.softcode.kanistek.model.dto.AddressDto;
import com.softcode.kanistek.model.entity.Hospital;
import com.softcode.kanistek.model.request.HospitalRegisterRequest;
import com.softcode.kanistek.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public void save(Hospital hospital){
        String hashPassword = passwordEncoder.encode(hospital.getPassword());
        hospital.setPassword(hashPassword);
        hospitalRepository.save(hospital);
    }

    public void create(HospitalRegisterRequest request) {
        Hospital hospital = modelMapper.map(request,Hospital.class);
        save(hospital);
    }

    public AddressDto updateHospitalId(AddressDto addressDto) {
        //TODO burası dolduralacak
        System.out.println("asdasd");
        return null;
    }
}
