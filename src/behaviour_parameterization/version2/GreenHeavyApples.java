package behaviour_parameterization.version2;

public class GreenHeavyApples implements AppleCriteria {
    @Override
    public boolean isMatching(Apple apple) {
        return apple.getColor().equals("Green") && apple.getWeight() >= 500;
    }
}
