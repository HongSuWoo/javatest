package auth.impl;

import auth.SnsAuth;
import dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("google 로그인됨");
        return true;
    }
}
