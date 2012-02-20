/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-2-1
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class Gift {
    private String name;
    private int id;
    private String description;

    public Gift(int ID)
    {
        this.id = ID;
        switch (ID)
        {
            case 1:
                this.name = "奖金";
                this.description = "玩家获得奖金2000元.";
                break;
            case 2:
                this.name = "点数卡";
                this.description = "玩家获得200点.";
                break;
            case 3:
                this.name = "福神";
                this.description = "福神俯身，路过其它玩家地盘，均可免费。5轮内有效。";
                break;
            default:
                System.out.print("没有该物品");
        }

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
        return this.id;
    }
    public int setID(int ID)
    {
        this.id = ID;
        return this.id;
    }
}
