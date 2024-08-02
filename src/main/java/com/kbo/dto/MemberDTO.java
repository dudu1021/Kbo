package com.kbo.dto;

public class MemberDTO {
    private int team_code; // 팀 코드를 저장하는 필드

    // 기본 생성자
    public MemberDTO() {
    }

    // 팀 코드를 매개변수로 받는 생성자
    public MemberDTO(int team_code) {
        this.team_code = team_code;
    }

    // 팀 코드를 반환하는 getter 메서드
    public int getTeam_code() {
        return team_code;
    }

    // 팀 코드를 설정하는 setter 메서드
    public void setTeam_code(int team_code) {
        this.team_code = team_code;
    }
}
