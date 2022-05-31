package decorate;

/**
 * @ClassName WallBeautifyClean
 * @Author niejun
 * @Date 2022/5/30
 * @Description: 墙面装修基本实现（清理墙面）
 * @Version 1.0
 **/
public class WallBeautifyClean implements WallBeautify{

    @Override
    public void operation() {
        System.out.println("开始清零墙面");
    }
}
