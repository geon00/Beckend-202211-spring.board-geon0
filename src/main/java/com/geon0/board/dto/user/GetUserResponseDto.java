package com.geon0.board.dto.user;

import com.geon0.board.Entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponseDto {
	private String email;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;
	
	public GetUserResponseDto(MemberEntity member) {
		this.email = member.getEmail();
		this.nickname = member.getNickname();
		this.profile = member.getProfile();
		this.telNumber = member.getTelNumber();
		this.address = member.getAddress();
	}
}
