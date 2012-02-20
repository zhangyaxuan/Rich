//import com.sun.java.swing.plaf.windows.TMSchema;

import java.util.List;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-1-31
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public class RichRole {
    private String name;
    private char nameID;
    private int place;
    private int state;
    private Vector<Prop> propPackage;
    private Gift gift;
    private int money;
    private int point_value;
    private Terra[] terras;

    public RichRole(char NameID, int Capital) {

        try {
            switch (NameID)
            {
            case '1':
                this.name = "钱夫人";
                break;
            case '2':
                this.name = "阿土伯";
                break;
            case '3':
                this.name = "孙小美";
                break;
            case '4':
                this.name = "金贝贝";
                break;
            default:
                    throw new Exception("角色序号错误");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        this.nameID = NameID;
        this.money = Capital;
        this.place = 0;
        this.point_value = 0;
        this.propPackage = new Vector<Prop>();
        this.gift = null;
    }
    public String getName()	//角色名
	 {
		 return this.name;
	 }
	 public String setName(String Name)
	 {
		 this.name=Name;
		 return this.name;
	 }
     public char getNameID()	//角色序号
	 {
		 return this.nameID;
	 }
	 public char setNameID(char NameID)
	 {
		 this.nameID=NameID;
		 return this.nameID;
	 }
     public int getPlace()	//角色位置
	 {
		 return this.place;
	 }
	 public int setNameID(int Place)
	 {
		 this.place=Place;
		 return this.place;
	 }
    public int getState()	//角色状态
	 {
		 return this.state;
	 }
	 public int setState(int State)
	 {
		 this.state = State;
		 return this.state;
	 }
    public int getMoney()	//资金
	 {
		 return this.money;
	 }
	 public int setMoney(int Money)
	 {
		 this.money=Money;
		 return this.money;
	 }
    public int getPoint_value()	//点数
	 {
		 return this.point_value;
	 }
	 public int setPoint_value(int Point)
	 {
		 this.point_value=Point;
		 return this.point_value;
	 }
    public Vector<Prop> getPropPackage()	//道具
	 {
		 return this.propPackage;
	 }
	 public Vector<Prop> setPropPackage(Vector<Prop> PropPackage)
	 {
		 this.propPackage = PropPackage;
		 return this.propPackage;
	 }
    //移动
    public void rolesMove(int stepNum)	//移动
	 {
		 this.place += stepNum;
		 this.place %= 69;
	 }
    //买入一个道具
    public boolean buyProps(Prop wantedProp)
    {
         if (this.propPackage.size() <= 10)
         {
            this.propPackage.add(wantedProp);
             return true;
         }
        else
         {
             System.out.println("您的包裹满了，最多只能装10个道具。");
         }
        return false;
    }
    //卖出一个道具
    public void saleProps(int propID)
    {
        boolean exist = false;
        for (int i=0; i<this.getPropPackage().size(); i++)
        {
            if (this.propPackage.get(i).getID() == propID)
            {
                exist = true;
                this.propPackage.removeElementAt(i);
                break;
            }
        }
        if (exist == false)
            System.out.println("您的包裹里没有该物品");
    }
    //买地产
    //卖地产
    //查询资产
}
