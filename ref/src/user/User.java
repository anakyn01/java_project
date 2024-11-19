package user;

public class User {
	
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	//getter(setter������ ���� ����)
	public String getUserID() {return userID;}
	public String getUserPassword() {return userPassword;}
	public String getUserName() {return userName;}
	public String getUserGender() {return userGender;}
	public String getUserEmail() {return userEmail;}
	
	
	//setter ���� ����
	public void setUserID(String userID) {this.userID = userID;}
	public void setUserPassword(String userPassword) {this.userPassword = userPassword;}
	public void setUserName(String userName) {this.userName = userName;}
	public void setUserGender(String userGender) {this.userGender = userGender;}
	public void setUserEmail(String userEmail) {this.userEmail = userEmail;}
	
	
	
/*ȸ�������� �Ұ�� ������ UI���� ������ �ϰ� �ڹ�Ŭ���� ����������(private)�� �ʵ��
���̺� �ʵ尡 ��ġ�ؾ߸� ȸ�����Կ� ����
���������ڴ� ����� Ŭ������������ ������ �Ҽ� �ִ�
setter => ���� ����
getter => ���õ� ���� ����

java Modifiers ������
Ŭ���� �Ӽ� �޼��� �� �����ڿ� ���� ������ ������ �����ϴµ� ���˴ϴ�

�����ڴ� �ΰ��� �׷����� ������ ���ϴ�
- ������ ������ : ������ ������ �����մϴ�
1) Ŭ������ ��� public �Ǵ� default
2) �Ӽ� �޼��� �� �������� ��쿡�� 
public, private, default, protected

- �񿢼��� ������ : ������ ������ �������� ������ �ٸ� ����� �����մϴ�
final, static, abstract, synchronized
*/
}
