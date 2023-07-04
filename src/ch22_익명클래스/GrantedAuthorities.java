package ch22_익명클래스;

@FunctionalInterface  // -> 메소드(함수)는 딱 하나만 있어야한다는 뜻
public interface GrantedAuthorities {

	public String getAuthority();

}
