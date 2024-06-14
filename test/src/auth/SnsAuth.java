package auth;

import dto.MemberDTO;

public interface SnsAuth {
    boolean login(MemberDTO member);

}
