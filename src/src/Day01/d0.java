package Day01;

class Auto{
	  int luntai;
	  int renshu;
	  String color;
	  double weight;
	  double chesu;
	  void suchu(int sudu){
		  System.out.println("����"+sudu);
		  System.out.println("����"+sudu);
	  }
}
class car extends Auto{
	  String kongtiao;
		String cd;
		void suchu() {
			System.out.println("�¿յ�:"+kongtiao);
			System.out.println("DVD����:"+cd);
		}
	}
	public class d0 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			car q=new car();
			q.luntai=4;
			q.color="��ɫ";
			q.renshu=14;
			q.chesu=325.0;
			q.weight=5000;
			q.kongtiao="���Ŀյ�";
			q.cd="����֮��";
			System.out.println("����һ��"+q.color+"С����������"+q.luntai+"����̥,��������"+q.renshu+"����,����Ϊ"+q.chesu+"����ÿСʱ,����������"+q.weight+
					"kg,�����ÿյ���"+q.kongtiao+",��Ҳ�����õ�cd�����ŵĸ�����"+q.cd);
			System.out.println("��������뿿��ͣ��");
		}

	}
