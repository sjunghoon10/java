package vo;

import java.util.Objects;

public class MemberVO {
	private Long id;	
	private String memberID;
	private String memberPassword;
	private String memberName;
	private String memberAddress;
	private String MemberRecommenerID;
	
	public MemberVO() {
	}
	
	public MemberVO(Long id, String memberID, String memberPassword, String memberName, String memberAddress,
			String memberRecommenerID) {
		super();
		this.id = id;
		this.memberID = memberID;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		MemberRecommenerID = memberRecommenerID;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(MemberRecommenerID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(MemberRecommenerID, other.MemberRecommenerID);
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberRecommenerID() {
		return MemberRecommenerID;
	}
	public void setMemberRecommenerID(String memberRecommenerID) {
		MemberRecommenerID = memberRecommenerID;
	}
}
