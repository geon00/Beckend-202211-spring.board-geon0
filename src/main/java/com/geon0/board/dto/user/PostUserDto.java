package com.geon0.board.dto.user;

import org.antlr.v4.runtime.misc.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostUserDto {
	
		@NotNull
		private String email;
		@NotNull
		private String password;
		@NotNull
		private String password2;
		@NotNull
		private String nickname;
		@NotNull
		private String telNumber;
		@NotNull
		private String address;
		@NotNull
		private String addressDetail;
	
}
