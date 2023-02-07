package behaviour_parameterization.version2;

public class RedApples implements AppleCriteria {
    @Override
    public boolean isMatching(Apple apple) {
        return apple.getColor().equals("Red");
    }
}
