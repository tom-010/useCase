export class Broker {

    protected topics: Map<string, Array<(data: any)=>void>> = new Map();
    protected static instance: Broker;

    public static get(): Broker {
        if(!this.instance)
            this.instance = new Broker();
        return this.instance;
    }

    protected constructor() {}
    
    public publish(channel: string, data: any): void {
    }

    public register(channel: string, cb: (data: any)=>void) {
        if(!channel || channel == '' || !cb)
            return;

        if(!this.topics.get(channel))
            this.topics.set(channel, []);

        this.topics.get(channel).push(cb);
    }
}