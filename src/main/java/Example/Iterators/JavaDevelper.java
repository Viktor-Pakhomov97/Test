package Example.Iterators;

public class JavaDevelper implements Collection {
private String name;
private String[] skills;

    public JavaDevelper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Iterator getIterator() {
        return new GetNumbers();
    }
    private class GetNumbers implements Iterator {
        int index;
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            return skills[index++];
        }
    }
}
