package decorate;

/**
 * @ClassName DecoratorTest
 * @Author niejun
 * @Date 2022/5/30
 * @Description:
 * @Version 1.0
 **/
public class DecoratorTest {

    public static void main(String[] args) {
        // 清理墙面
        WallBeautify wallBeautifyClean = new WallBeautifyClean();
        wallBeautifyClean.operation();
        System.out.println("--------------");

        // 刮腻子
        WallBeautify wallBeautifyPutty = new WallBeautifyPutty(wallBeautifyClean);
        wallBeautifyPutty.operation();
        System.out.println("--------------");

        // 涂油漆
        WallBeautify wallBeautifyPaint = new WallBeautifyPaint(wallBeautifyPutty);
        wallBeautifyPaint.operation();
        System.out.println("--------------");

        // 挂壁画
        WallBeautify wallBeautifyHang = new WallBeautifyHang(wallBeautifyPaint);
        wallBeautifyHang.operation();
        System.out.println("--------------");

        // 多层嵌套
        WallBeautify wbh = new WallBeautifyHang(new WallBeautifyPaint(
                new WallBeautifyPutty(new WallBeautifyClean())));
        wbh.operation();
        System.out.println("--------------");
    }

}
