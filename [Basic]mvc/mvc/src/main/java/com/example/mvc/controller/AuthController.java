/*
package com.example.mvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {
    // 속성
    // 세션 저장소
    private final Map<String, String> sessionStorage = new HashMap<>();

    // 기능
    @GetMapping("/cookie")
    public String cookieAPI(HttpServletRequest request) { // 요청객체 받아옴
        log.info("::: AuthController.cookieAPI");

        // 1. Request 객체에서 cookie 목록 가져오기
        Cookie[] cookies = request.getCookies();
        // 2. 쿠키 (userID) 키값으로 value 찾는 함수 호출
        String foundUserId = findCookies("userID", cookies); // 쿠키 리스트 쫙 돌면서 userID 쿠키를 찾음
        // 3. 찾아온 쿠키의 값 출력
        if (foundUserId != null) {
            log.info("found userID: {}", foundUserId);
        } else {
            log.info("userID not found");
        }

        */
/*log.info("debug1");
        // 서비스 로직1의 대한 로그
        log.info("debug2");
        // 서비스 로직2의 대한 로그*//*

        return "success";
    }

    @GetMapping("/cookie-login")
    public ResponseEntity<String> cookieLoginAPI() {
        //log.info("::: AuthController.cookieLoginAPI()");

        // 1. 로그인 로직 => 디비 조회해서  유저 찾기
        String cookieKey = "UserId";
        String userID = "1";

        // 2. 생성 - 헤더생성
        String headerValue = cookieKey + "=" + userID;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Set-Cookie", headerValue);

        // 5. 응답반환
        return new ResponseEntity<>("로그인 성공", headers, HttpStatus.OK);
    }
    private String findCookies(String key, Cookie[] cookies) {
        if (cookies != null) {
            for(Cookie cookie : cookies) {
                if (key.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    @GetMapping("/session")
    public String sessionAPI(HttpServletRequest request) {
        log.info("::: AuthController.sessionAPI()");
        // 쿠키에서 sessionId 검색
        Cookie[] cookies = request.getCookies();
        String sessionId = findCookies("sessionId", cookies);

        // 세션 id 조회
        if(sessionId != null) {
            String userData = sessionStorage.get(sessionId);
            log.info("found session: {}", userData);
        } else {
            log.info("session not found");
        }
        return "success";
    }

    @GetMapping("/session-login")
    public ResponseEntity<String> sessionLoginAPI() {
        log.info("::: AuthController.sessionLogin()");
        // 1. 로그인 데이터 처리

        // 2. 데이터 베이스에서 사용자 정보 조회
        String sessionId = "xxxx";
        String sessionData = "userId: 1";

        // 3. 세션 저장소에 유저 정보 저장
        sessionStorage.put(sessionId, sessionData);

        // 4. 생성 - 헤더 생성 sessionID = cat
        String headerValue = "sessionId" + "=" + sessionId;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Set-Cookie", headerValue);

        // 5. 응답 반환
        return new ResponseEntity<>("로그인 성공", headers, HttpStatus.OK);
    }

    @GetMapping("/token-login")
    public ResponseEntity<String> tokenLoginAPI() {
        log.info("::: AuthController.tokenLoginAPI()");
        // 1. 로그인 로직 처리

        // 2. 데이터 베이스에서 사용자 정보 조회
        String userData = "userId: 1";

        // 3. 토큰 생성
        String encodedData = encodeToBase64(userData);

        // 4. 생성 - 헤더 생성
        String headerValue = "token" + "=" + encodedData;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Set-Cookie", headerValue);

        // 5. 응답 반환
        return new ResponseEntity<>("로그인 성공", headers, HttpStatus.OK);
    }

    private String encodeToBase64(String input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
        String encodedToken = new String(encodedBytes);
        return encodedToken;
    }

    private String parseToken(String token) {
        byte[] decodedBytes = Base64.getDecoder().decode(token);
        String decodedToken = new String(decodedBytes);
        return decodedToken;
    }
}
*/
