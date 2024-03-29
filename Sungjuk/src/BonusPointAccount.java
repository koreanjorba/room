
public class BonusPointAccount extends Account{

	int bonusPoint; //누적 포인트
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint)
	{
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	//overriding
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int)(amount*0.001);
	}
}
