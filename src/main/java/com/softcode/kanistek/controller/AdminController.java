package com.softcode.kanistek.controller;

import com.softcode.kanistek.base.BaseResponse;
import com.softcode.kanistek.model.request.AuthorityAndEmail;
import com.softcode.kanistek.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    public ResponseEntity<BaseResponse<?>> setUserRoleWithEmailAndAuthorityName(@RequestBody AuthorityAndEmail request){
        //TODO BURAYA SADECE ADMIN ERİŞEBİLECEK
        //İSTEDİĞİ KULLANICININ EMAİLİNİ VE ONA VERMEK İSTEDİĞİ ROL NAME İLE İSTEK ATACAK VE KULLANICIYA ROL VERMİŞ OLACAK
        //3 ADET ROL VAR SİSTEMDE ŞU ANDA MAİN CLASINDAN GÖREBİLİRSİNİZ
        //ADMİN USER VE HOSPİTAL OLARAK 3 TANE
        //BU SAYFADA ADMİN İLE İLGİLİ İŞLEMLER YAPICAZ KULLANICI BLOKLAMA GİBİ
        //ANCAK ŞU AN İÇİN SADECE YETKİ ATAMA İŞLEMİ YAPICAZ. BU METODU DOLDURABİLİRSENİZ GÜZEL OLUR
        //GERİYE BaseResponse.ok(null,201); dönebilir
        //201 DÖNMESİNİN SEBEBİ OLUŞTURULDU ANLAMINA GELİYOR YANİ O KULLANICIYA O YETKİ VERİLDİ

        return null;
    }




}
