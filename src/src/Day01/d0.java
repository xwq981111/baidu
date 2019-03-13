package Day01;

class Auto{
	  int luntai;
	  int renshu;
	  String color;
	  double weight;
	  double chesu;
	  void suchu(int sudu){
		  System.out.println("加速"+sudu);
		  System.out.println("减速"+sudu);
	  }
}
class car extends Auto{
	  String kongtiao;
		String cd;
		void suchu() {
			System.out.println("新空调:"+kongtiao);
			System.out.println("DVD播放:"+cd);
		}
	}
	public class d0 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			car q=new car();
			q.luntai=4;
			q.color="黄色";
			q.renshu=14;
			q.chesu=325.0;
			q.weight=5000;
			q.kongtiao="美的空调";
			q.cd="月亮之上";
			System.out.println("我有一辆"+q.color+"小汽车，它有"+q.luntai+"个轮胎,车上坐着"+q.renshu+"个人,车速为"+q.chesu+"公里每小时,它的重量是"+q.weight+
					"kg,它内置空调是"+q.kongtiao+",它也有内置的cd，播放的歌曲是"+q.cd);
			System.out.println("减速完成请靠边停车");
		}

	}
