import { Broker } from "./broker";
import { ExamplesRepository } from "./model/examples-repository";
import { UseCaseRepository } from './use-case-repo';

export class DomainContext {

    public examplesRepo: ExamplesRepository;
    public broker: Broker;
    public useCaseRepo: UseCaseRepository;

    private static instance: DomainContext;
    private constructor() {}

    public static get(): DomainContext {
        if(!DomainContext.instance)
            DomainContext.instance = new DomainContext;
        return DomainContext.instance;
    }

}