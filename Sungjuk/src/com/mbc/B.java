package com.mbc;

public class B {

//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; // 디폴트 지만 - 같은 패키지
		//a.field3 = 1;
		
		a.method1();
		a.method2();
		//a.method3();
	}
	
}
