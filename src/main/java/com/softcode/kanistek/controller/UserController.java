package com.softcode.kanistek.controller;


import com.softcode.kanistek.base.BaseResponse;
import com.softcode.kanistek.model.dto.AddressDto;
import com.softcode.kanistek.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("/address")
    public ResponseEntity<BaseResponse<AddressDto>> updateAddress(@RequestBody AddressDto addressDto){
        AddressDto response = userService.updateAddress(addressDto);
        return BaseResponse.ok(addressDto);
    }

}
