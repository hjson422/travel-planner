package Jeju.travelplanner.controller;


import Jeju.travelplanner.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    @PostMapping
    public ResponseEntity login(
            @RequestParam String loginId,
            @RequestParam String password
            ){

        testService.login(loginId, password);
        return ResponseEntity.ok("성공");
    }
}
