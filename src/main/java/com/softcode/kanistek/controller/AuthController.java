package com.softcode.kanistek.controller;


import com.softcode.kanistek.base.BaseResponse;
import com.softcode.kanistek.model.entity.Address;
import com.softcode.kanistek.model.entity.User;
import com.softcode.kanistek.model.request.LoginRequest;
import com.softcode.kanistek.model.request.UserRegisterRequest;
import com.softcode.kanistek.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<BaseResponse<UserDto>> register(@RequestBody UserRegisterRequest request){
        //TODO burayı doldurun
        UserDto userDto = userService.register(request);
        return BaseResponse.ok(userDto,201);
    }
    @PostMapping("/login")
    public ResponseEntity<BaseResponse<String>> login(@RequestBody LoginRequest request){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword());
        Authentication authentication= authenticationManager.authenticate(authenticationToken);
        String jwtToken = userService.login(authentication);
        return BaseResponse.ok(jwtToken);
    }
}
