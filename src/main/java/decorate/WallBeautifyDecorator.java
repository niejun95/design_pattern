package decorate;

/**
 * @ClassName WallBeautifyDecorator
 * @Author niejun
 * @Date 2022/5/30
 * @Description: WallBeautifyDecorator
 * @Version 1.0
 **/
public abstract class WallBeautifyDecorator implements WallBeautify{
    private WallBeautify wallBeautify;

    public WallBeautifyDecorator(WallBeautify wallBeautify) {
        this.wallBeautify = wallBeautify;
    }
    
    public void operation() {
        wallBeautify.operation();
        decoration();
    }

    protected abstract void decoration();

}
