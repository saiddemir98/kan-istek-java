package com.softcode.kanistek.service;

import com.softcode.kanistek.helper.JwtHelper;
import com.softcode.kanistek.model.dto.AddressDto;
import com.softcode.kanistek.model.entity.User;
import com.softcode.kanistek.model.request.UserRegisterRequest;
import com.softcode.kanistek.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    //SOLID

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final JwtHelper jwtHelper;


    public void create(User user){
        String hasPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hasPassword);
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) throw new UsernameNotFoundException("Kullanıcı adı veya şifre hatalı.");
        return user;
    }

    public void register(UserRegisterRequest request) {
        User user = modelMapper.map(request,User.class);
        this.create(user);
    }


    public String login(Authentication authentication) {
        User myPrinciple = (User) authentication.getPrincipal();
        String token = jwtHelper.generateToken(myPrinciple.getUsername());
        return token;
    }

    public AddressDto updateAddress(AddressDto addressDto) {
        return null;
    }
}
