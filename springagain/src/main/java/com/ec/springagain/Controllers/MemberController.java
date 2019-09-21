package com.ec.springagain.Controllers;

import com.ec.springagain.models.Member;
import com.ec.springagain.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired // 자동으로 가지고 옴
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.POST) //("") 생략가능 뒤에 아무것도 없어서 다 똑같지만 POST로 들어오면 여기로 감
    public void addMember(@RequestBody Member member){ //member는 message body로 보낼거임
        memberService.addMember(member);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Member> getMembers(){
        return memberService.getMembers();
    }

    // /members/18101208      //18101208이 get을 통해서 id로 들어감
    @RequestMapping(value="/{id}", method = RequestMethod.GET) //{id} 오타 조심, 소괄호가 아니라 중괄호! +) 수정한후에 무조건 다시시작해야함!!!!!! 근데 데이터가 날라가....ㅠㅠ
    public Member getMemberById(@PathVariable("id") String id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public boolean updateMember(@PathVariable("id") String id, @RequestBody Member member){
        return memberService.updateMember(id, member);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public boolean deleteMember(@PathVariable("id") String id){
        return memberService.deleteMember(id);
    }
}
