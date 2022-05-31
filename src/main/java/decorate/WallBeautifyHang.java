package decorate;

/**
 * @ClassName WallBeautifyHang
 * @Author niejun
 * @Date 2022/5/30
 * @Description: 墙面装修装饰器角色实现（挂壁画）
 * @Version 1.0
 **/
public class WallBeautifyHang extends WallBeautifyDecorator {

    public WallBeautifyHang(WallBeautify wallBeautify) {
        super(wallBeautify);
    }

    @Override
    public void decoration() {
        System.out.println("开始挂壁画");
    }

}