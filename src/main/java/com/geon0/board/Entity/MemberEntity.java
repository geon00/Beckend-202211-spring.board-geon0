package com.geon0.board.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/* member
* 이메일
* 비밀번호
* 닉네임
* 프로필 사진
* 전화번호
* 주소
*/
// 테이블에 대한 맵핑 Entity끝
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// 해당 클래스가 Entity 클래스임을 명시
// 인자로 Entity의 이름을 지정 할 수 있음
@Entity(name = "member")
// 해당 Entity 클래스와 데이터베이스 Table을
// 인자로 지정한 이름으로 맵핑
@Table(name = "member")
public class MemberEntity {
	
	// 해당 필드가 primary key임을 명시
	@Id
	// 해당 primary key의 value 자동 생성을 지시
//	@GeneratedValue
	private String email;
	private String password;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;
}
