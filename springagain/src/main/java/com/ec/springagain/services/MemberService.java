package com.ec.springagain.services;

import com.ec.springagain.models.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {

    private ArrayList<Member> members;

    public MemberService() {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member){
        //멤버 추가
        members.add(member);
    }

    public ArrayList<Member> getMembers() {
        //모든 멤버 반환
        return members;
    }

    public Member getMemberById(String id){
        // 해당 아이디 멤버 반환
        for(Member member : members){ // 각각 돌리면서 member에 members의 내용?이 들어감
            if(member.getId().equals(id)){ //String은 equals
                return member;
            }
        }

        return null;
    }

    public boolean updateMember(String id, Member updatedmember){
        // 맴버 수정
        for(Member member : members){ // 각각 돌리면서 member에 members의 내용?이 들어감
            if(member.getId().equals(id)){ //String은 equals
                member.setName(updatedmember.getName());
                member.setContacts(updatedmember.getContacts());
                return true; //넣을때 작가 정보 입력 안하면 null값 들어감
            }
        }
        return false;
    }

    public boolean deleteMember(String id){
        // 멤버 삭제
        for(Member member : members){
            if(member.getId().equals(id)){
                members.remove(member);
                return true;
            }
        }
        return false;
    }


}
