package Example.Iterators;

public class Test {
    public static void main(String[] args) {
        String [] skills = {"java","Spring","GIT","SQL"};
        JavaDevelper javaDevelper = new JavaDevelper("Viktor",skills);
        Iterator iterator = javaDevelper.getIterator();
    }
}
