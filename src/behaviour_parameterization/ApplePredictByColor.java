package behaviour_parameterization;
public class ApplePredictByColor implements ApplePredict{
    Apple.Color color;
    public ApplePredictByColor(Apple.Color color)
    {
        this.color=color;
    }
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(this.color);
    }
}