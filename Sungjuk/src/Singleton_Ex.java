
public class Singleton_Ex {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); ���� �Ұ�(������ ����)
		//Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� �̱��� ��ü �Դϴ�");
		}else {
			System.out.println("�ٸ� �̱��� ��ü �Դϴ�");
		}


	}

}
