package com.softcode.kanistek.controller;

import com.softcode.kanistek.base.BaseResponse;
import com.softcode.kanistek.model.dto.AddressDto;
import com.softcode.kanistek.model.request.HospitalRegisterRequest;
import com.softcode.kanistek.model.secuirty.MyPrinciple;
import com.softcode.kanistek.service.HospitalService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Null;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hospital")
@RequiredArgsConstructor
public class HospitalController {

    private final HospitalService hospitalService;

    @PostMapping("/create")
    public ResponseEntity<BaseResponse<Object>> createHospital(@RequestBody @Valid HospitalRegisterRequest request){
        hospitalService.create(request);
        return BaseResponse.ok(null,201);
    }

    @PutMapping("/update")
    public ResponseEntity<BaseResponse<AddressDto>> updateHospital(@RequestBody AddressDto addressDto){
        AddressDto response = hospitalService.updateHospitalId(addressDto);
        MyPrinciple girisYapmisKullanici = (MyPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return BaseResponse.ok(response);
    }



}
