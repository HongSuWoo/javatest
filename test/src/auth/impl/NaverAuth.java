package auth.impl;

import auth.SnsAuth;
import dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO member) {
        System.out.println("naver 로그인됨");
        return true;
    }
}
