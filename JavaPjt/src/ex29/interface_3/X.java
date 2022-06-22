package ex29.interface_3;
/*
 * 인터페이스
 * 1. 서로간의 약속임.
 * 2. 구현을 위한 어떤것도 허용이 안됨 (변수정의, 접근제한자 등)
 * */
public interface X {  // 키워드 인터페이스

	// 변수 정의 불가
	
	int total(); // public등 접근제한자 사용 불가
}
