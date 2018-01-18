package knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "context.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();

        System.out.println();

        Knight anotherKnight = (Knight) context.getBean("anotherKnight");
        anotherKnight.embarkOnQuest();

        context.close();
    }
}
