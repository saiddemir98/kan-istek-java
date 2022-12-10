package com.softcode.kanistek.helper;

import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;

@Service
public class JwtHelper {


    private String secretkey = "secretkey";
    private Algorithm algorithm = Algorithm.HMAC256(secretkey);


    public  String generateToken(String email){
        String token = JWT.
                create().withSubject(email).sign(algorithm);
        return token;
    }

    public String getSubject(String token){
        DecodedJWT decodedJWT = JWT.require(algorithm).build().verify(token);
        return decodedJWT.getSubject();
    }







}
