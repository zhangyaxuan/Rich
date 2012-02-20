import javax.management.relation.Role;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-1-31
 * Time: 下午4:54
 * To change this template use File | Settings | File Templates.
 */
public class Terra {
    //private String name; //名称
    private String sign; //标记
    private int id; //编号
    private int streetID; //地段
    private int value; //地皮价格
    private int grade; //建筑等级
    private RichRole owner; //所有者

    public Terra(String Sign, int ID, int StreetID)
    {
        this.sign = Sign;
        this.id = ID;
        this.streetID = StreetID;
        this.grade = 0;
        this.owner = null;
        switch (StreetID)
        {
            case 0:
                this.value = -1;
            case 1:
            case 2:
                this.value = 200;
                break;
            case 3:
                this.value = 500;
                break;
            case 4:
            case 5:
                this.value = 300;
                break;
            default:
                System.out.print("没有此地段号");
        }
    }
    public String getSign()	//名称
	 {
		 return this.sign;
	 }
	 public String setSign(String Sign)
	 {
		 this.sign = Sign;
		 return this.sign;
	 }
    public int getGrade()	//等级
	 {
		 return this.grade;
	 }
	 public int setGrade(int grade)
	 {
		 this.grade=grade;
		 return this.grade;
	 }
    public RichRole getOwner()	//所有者
	 {
		 return this.owner;
	 }
	 public RichRole setOwner(RichRole owner)
	 {
		 this.owner=owner;
		 return this.owner;
	 }


}
