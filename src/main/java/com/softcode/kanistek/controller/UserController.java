package com.softcode.kanistek.controller;


import com.softcode.kanistek.base.BaseResponse;
import com.softcode.kanistek.model.dto.AddressDto;
import com.softcode.kanistek.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/bloods")
    public ResponseEntity<BaseResponse<Page>> getBloodRequests(@PageableDefault Pageable pageable){

        return null;
    }


}
