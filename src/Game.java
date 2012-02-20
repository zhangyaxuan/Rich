/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-1-31
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.io.*;
public class Game {
    public void play(){
        //地图初始化
        Terra[] terras = new Terra[70];
        initMap(terras);
        //打印地图
        printMap(terras);
        //设置初始资金1000~50000（默认10000）
        int capital = 10000;
        System.out.println("默认初始资金10000，是否需要自定义初始资金，请选择（Y/N）");
        try {
            char YorN = (char)System.in.read();
            if (YorN == 'Y')
            {
                System.out.print("请输入初始资金1000~50000");
                capital = System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }



        //选择角色
        System.out.print("请选择2~4位不重复玩家，输入编号即可。(1.钱夫人; 2.阿土伯; 3.孙小美; 4.金贝贝):");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String chosenRolesID = null;
        try {
            chosenRolesID = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        chooseRoles(chosenRolesID, capital);
    }

    //选择角色
    public void chooseRoles(String choosedRoles, int capital) {
        char[] rolesID = choosedRoles.toCharArray();
        try {
            if (rolesID.length>1 && rolesID.length < 4)
            {
                //初始化角色
                RichRole[] roles = new RichRole[rolesID.length];
                for (int i=0;i<rolesID.length;i++)
                {
                    roles[i] = new RichRole(rolesID[i], capital);
                    System.out.println("您选择的第" + (i+1) + "个角色是：" + roles[i].getName());
                }
            }
            else
                throw new Exception("只能选择2~4个角色");
            }
        catch (Exception e) {
            System.out.println(e.toString());
            System.exit(0);
            }
    }

    //地图初始化
    private void initMap(Terra[] terras)
    {
        terras[0] = new Terra("S", 0, 0);
        for (int n=1; n<14; n++)
        {
            terras[n] = new Terra("O", n, 1);
        }
        terras[14] = new Terra("H", 14, 0);
        for (int n=15; n<28; n++)
        {
            terras[n] = new Terra("O", n, 2);
        }
        terras[28] = new Terra("T", 28, 0);
        /*for (int n=0;n<29;n++)
        {
            System.out.print(terras[n].getSign());
        }
        System.out.println();*/
        for (int n=0; n<6; n++)
        {
            terras[69-n] = new Terra("$", 69-n, 0);
            //System.out.print(terras[69-n].getSign());
            //for (int m=0; m<27; m++)
              //  System.out.print(" ");
            terras[29+n] = new Terra("O", 29+n, 3);
           // System.out.println(terras[29+n].getSign());
        }
        terras[35] = new Terra("G", 35, 0);
        for (int n=36; n<49; n++)
        {
            terras[n] = new Terra("O", n, 4);
        }
        terras[49] = new Terra("P", 49, 0);
        for (int n=50; n<63; n++)
        {
            terras[n] = new Terra("O", n, 5);
        }
        terras[63] = new Terra("M", 63, 0);
        /*for (int n=63;n>34;n--)
        {
            System.out.print(terras[n].getSign());
        }
        System.out.println();*/

    }
    //打印地图
    private void printMap(Terra[] terras)
    {
        for (int n=0;n<29;n++)
        {
            System.out.print(terras[n].getSign());
        }
        System.out.println();
        for (int n=0; n<6; n++)
        {
            System.out.print(terras[69-n].getSign());
            for (int m=0; m<27; m++)
                System.out.print(" ");
            System.out.println(terras[29+n].getSign());
        }
        for (int n=63;n>34;n--)
        {
            System.out.print(terras[n].getSign());
        }
        System.out.println();
    }

}
