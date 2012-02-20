/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-2-1
 * Time: 下午5:04
 * To change this template use File | Settings | File Templates.
 */
public class Prop {
    private String name;
    private int ID;
    private String description;
    public Prop(int ID)
    {
        switch (ID)
        {
            case 1:
                this.name = "路障";
                this.description = "玩家拥有路障后，可将路障放置到离当前位置前后10步的距离，任一玩家经过路障，都将被拦截.";
                break;
            case 2:
                this.name = "机器娃娃";
                this.description = "可将炸弹放置到离当前位置前后10步的距离，任一玩家经过该位置，将被炸伤送往医院，住院三天.";
                break;
            case 3:
                this.name = "炸弹";
                this.description = "使用该道具，可清扫前方路面上10步以内的其它道具，如炸弹、路障。";
                break;
            default:
                System.out.print("没有该物品");
        }
        this.ID = ID;
    }
    public String getName()
    {
        return this.name;
    }
    public String setName(String Name)
    {
        this.name = Name;
        return this.name;
    }
    public int getID()
    {
        return this.ID;
    }
    public int setID(int ID)
    {
        this.ID = ID;
        return this.ID;
    }
    public String getDescription()	//获取道具描述
	 {
		 return this.description;
	 }
	 public String setDescription(String Description)//设置道具描述
	 {
		 this.description=Description;
		 return this.description;
	 }
}
