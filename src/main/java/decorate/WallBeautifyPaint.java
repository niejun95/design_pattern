package decorate;

/**
 * @ClassName WallBeautifyPaint
 * @Author niejun
 * @Date 2022/5/30
 * @Description: 墙面装修装饰器角色实现（涂油漆）
 * @Version 1.0
 **/
public class WallBeautifyPaint extends WallBeautifyDecorator {

    public WallBeautifyPaint(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("开始涂油漆");
    }

}