/*
package com.example.mvc.controller;

import com.example.mvc.domain.Member;
import jakarta.servlet.MultipartConfigElement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MvcController {

    private final List<Member> membersList = new ArrayList<>(); //db의 역할을 함

    public MvcController(MultipartConfigElement multipartConfigElement) {
    }

    // 전체 회원 리스트 페이지 조회 api
    @GetMapping
    public String getMemberListView(Model model) {
        model.addAttribute("members", membersList); // model 객체에 membersList를 저장하겠다 (key, value)
        // 뷰 그려 member패키지에 있는 member-list.html을
        return "member/member-list";
    }

    // 회원 생성 페이지 조회 api
    @GetMapping("/new")
    public String createMemberView() {
        return "member/member-create";
    }

    // 회원 생성 api
    @PostMapping()
    public String createMemberAPI(@ModelAttribute Member member) {
        membersList.add(member);
        //return "member/member-list";
        return "redirect:/members"; // view가 호출되지 않고 /members가 재호출됨
    }
}
*/
