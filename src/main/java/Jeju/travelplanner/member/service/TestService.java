package Jeju.travelplanner.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {

    public void login(String loginId, String password){

        System.out.println("loginId = " + loginId);
        System.out.println("password = " + password);
    }

}
