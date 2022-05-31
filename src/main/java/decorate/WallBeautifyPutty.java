package decorate;

/**
 * @ClassName WallBeautifyPutty
 * @Author niejun
 * @Date 2022/5/30
 * @Description:
 * @Version 1.0
 **/
public class WallBeautifyPutty extends WallBeautifyDecorator{

    public WallBeautifyPutty(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    protected void decoration() {
        System.out.println("开始刮腻子");
    }
}
