package mockery;

import junit.framework.TestCase;
import org.jmock.Mockery;

public class PublisherTest extends TestCase {
    Mockery context = new Mockery();

    public void testOneSubscriberReceivesAMessage() {
        final Subscriber subscriber = context.mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);

        final String message = "message";

        context.checking(new Expectations() {{
            oneOf (subscriber).receive(message);
        }});

        publisher.publish(message);

        context.assertIsSatisfied();
    }
}
