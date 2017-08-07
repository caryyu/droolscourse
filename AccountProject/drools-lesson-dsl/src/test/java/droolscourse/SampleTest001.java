package droolscourse;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import util.KnowledgeSessionHelper;

public class SampleTest001 {
    static KieContainer kieContainer;
    KieSession sessionStatefull = null;

    @BeforeClass
    public static void beforeClass() {
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    @Test
    public void testPerson() {
        sessionStatefull = KnowledgeSessionHelper
                .getStatefulKnowledgeSession(kieContainer, "rule-session");

        Person p1 = new Person();
        p1.setName("Lisa");
        p1.setAge(18);
        p1.setLocation("China");

        sessionStatefull.insert(p1);

        sessionStatefull.fireAllRules();
    }
}
