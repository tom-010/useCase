import { Broker } from './broker';

describe('Broker', () => {

    class MockBroker extends Broker {
        public static extractInstance(): MockBroker {
            return new MockBroker();
        }

        public getTopics(): Map<string, Array<(data: any) => void>> {
            return this.topics;
        }
    }

    function setUp() {
        const broker: MockBroker = MockBroker.extractInstance();
        return { broker };
    }

    it('should provide a broker instance', () => {
        expect(Broker.get()).not.toBe(null);
        expect(Broker.get()).not.toBe(undefined);
    });

    it('should have only one instance', () => {
        expect(Broker.get() === Broker.get()).toBeTruthy();
    });

    it('should not possible to register on a null channel', () => {
        const { broker } = setUp();
        const subscriberAmountBefore = broker.getTopics().keys.length;
        broker.register(null, () => {});
        expect(broker.getTopics().keys.length).toEqual(subscriberAmountBefore);
    });

    it('should not possible to register with a empty topic string', () => {
        const { broker } = setUp();
        const subscriberAmountBefore = broker.getTopics().keys.length;
        broker.register('', () => {});
        expect(broker.getTopics().keys.length).toEqual(subscriberAmountBefore);
    });

    it('should not possible to register with a null subscrier', () => {
        const { broker } = setUp();
        const subscriberAmountBefore = broker.getTopics().keys.length;
        broker.register('topic', null);
        expect(broker.getTopics().keys.length).toEqual(subscriberAmountBefore);
    });

    it('should not possible to register with a undefined subscrier', () => {
        const { broker } = setUp();
        const subscriberAmountBefore = broker.getTopics().keys.length;
        broker.register('topic', undefined);
        expect(broker.getTopics().keys.length).toEqual(subscriberAmountBefore);
    });

    it('should possible to register for an topic', () => {
        const { broker } = setUp();
        broker.register('topic', () => {});
        expect(broker.getTopics().get('topic')).not.toBeNull();
        expect(broker.getTopics().get('topic')).not.toBeUndefined();
        expect(broker.getTopics().get('topic').length).toBe(1);
    });

    it('should create a new channel for a new topic listener that listens for a unknown topic', () => {
        const { broker } = setUp();
        broker.register('topic', () => {});
        expect(broker.getTopics().keys.length).toBe(1);
        broker.register('topic2', () => {});
        expect(broker.getTopics().keys.length).toBe(2);
        broker.register('topic3', () => {});
        expect(broker.getTopics().keys.length).toBe(3);
    });

    it('should not create a new channel, if topic is already known', () => {
        const { broker } = setUp();
        broker.register('topic', () => {});
        broker.register('topic', () => {});
        expect(broker.getTopics().keys.length).toBe(1);
    });
});
