import org.junit.Before;
import org.junit.Test;
import sun.plugin2.message.GetAppletMessage;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-1-31
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class TestGame {
    @Test
    public void GetQianSunWhenInput13()
    {
        Game game = new Game();
        game.chooseRoles("13", 10000);
    }
    @Test
    public void RoleTest()
    {
        Prop bomb = new Prop(3);
        assertEquals("炸弹", bomb.getName());
        RichRole role = new RichRole('3', 10000);
        assertEquals("孙小美", role.getName());
        role.rolesMove(3);
        assertEquals(3, role.getPlace());
        assertEquals(10000, role.getMoney());
        role.buyProps(bomb);
        assertEquals(1, role.getPropPackage().size());

    }
    @Test
    public void saleProp()
    {
        Prop bomb = new Prop(3);
        Prop baby = new Prop(2);
        RichRole role = new RichRole('3', 10000);
        role.buyProps(bomb);
        role.buyProps(baby);
        assertEquals("炸弹", role.getPropPackage().get(0).getName());
        role.saleProps(3);
        assertEquals(1,role.getPropPackage().size());
        //assertEquals("炸弹", role.getPropPackage().get(0).getName());
    }
    @Test
    public void giftTest()
    {
        Gift gift = new Gift(2);
        assertEquals("点数卡", gift.getName());
    }
}
